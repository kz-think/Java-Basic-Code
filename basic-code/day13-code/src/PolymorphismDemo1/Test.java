package PolymorphismDemo1;

//多态：同类型的对象，表现出不同的形态
//多态的表现形式：父类类型 对象名称 = 子类对象；
//多态的前提: 有继承关系，有父类对象指向子类对象，有方法的重写
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Kevin");
        s.setAge(22);

        Teacher t = new Teacher();
        t.setName("Lisa");
        t.setAge(42);

        Administrator a = new Administrator();
        a.setName("Bob");
        a.setAge(50);

        register(s); //学生的信息为：Kevin, 22
        register(t); //老师的信息为：Lisa, 42
        register(a); //管理员的信息为：Bob, 50

    }

    //这个方法能接受老师，学生和管理员
    //只能把参数写成这三个类型的父类
    public static void register(Person p) {
        p.show();
    }
}
