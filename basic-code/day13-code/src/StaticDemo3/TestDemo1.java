package StaticDemo3;

import java.util.ArrayList;

public class TestDemo1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("Kevin",22,"Male");
        Student s2  =new Student("Peter",21,"Male");
        Student s3 = new Student("Owen",21,"Male");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);

    }
}
