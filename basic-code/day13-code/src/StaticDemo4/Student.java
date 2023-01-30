package StaticDemo4;

/*
    总结：
        静态方法中没有this关键字
        静态方法中，只能访问静态
        非静态方法可以访问所有
 */

//被static修饰的成员方法叫做静态方法
//多用在测试类与工具类中，Javabean类中很少使用
//调用方式：类名调用 or 对象名调用
public class Student {
    String name;
    int age;
    static String teacherName;

    //this表示当前方法调用者的地址值
    //这个this是由虚拟机赋值的
    public void  show1(Student this){
        System.out.println("this: " + this);
        System.out.println(name + "," + age + "," + teacherName);

        this.show2();
    }

    public void  show2(){
        System.out.println("show2");
    }

    //静态方法没有this关键字
    //静态方法不能调用非静态的成员变量（实例变量）
    public static void method(){
        System.out.println("静态方法");
    }
}
