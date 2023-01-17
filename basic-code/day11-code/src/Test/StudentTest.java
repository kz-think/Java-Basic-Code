package Test;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2.创建学生对象
        Student s1 = new Student("Kevin",22);
        Student s2 = new Student("Peter",21);
        Student s3 = new Student("Owen",20);

        //3.添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //4.遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i); //储存的为地址值
            System.out.println(stu.getName()+","+stu.getAge()); //要用方法打印出地址中的元素
        }
    }


}
