package StaticDemo1;

public class StudentTest {
    public static void main(String[] args) {
        //创建两个学生对象
        Student s1 = new Student("Kevin",22,"Male");
        Student s2 = new Student("Peter",21,"Male");
        Student.teacherName = "Mrs.Lisa";

        //不需要添加s1.teacherName, Public Static teacherName后这个类共享这个teacherName，只需要赋值一次
        s1.study();
        s1.show();
        s2.study();
        s2.show();




    }
}
