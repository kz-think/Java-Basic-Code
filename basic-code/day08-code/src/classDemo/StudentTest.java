package classDemo;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //括号里没有变量，调用的空参构造方法：
        Student s = new Student(); //打印：看看我执行了吗
        s.setName("Bob");
        s.setAge(18);
        System.out.println(s.getName()); //Bob
        System.out.println(s.getAge()); //18

        //括号里加上变量，调用带参构造
        Student s2 = new Student("Alice",21);
        System.out.println(s2.getName()); //Alice
        System.out.println(s2.getAge()); //21

        Student s3 = new Student("Lily",-2); //非法数据
        System.out.println(s3.getName()); //Lily
        System.out.println(s3.getAge()); //0

    }
}
