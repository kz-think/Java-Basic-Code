package ExtendsDemo3;

public class Student extends Person{
    public Student(){
        super(); //虚拟机会自动写这一行，调用父类无参构造用以访问父类中的成员变量
        System.out.println("子类无参构造");
    }

    public Student(String name, int age){
        super(name,age); //调用父类的有参构造
    }
}
