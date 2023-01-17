package classDemo;

//有main方法的类叫做测试类
//可以在测试类中创建javabean类的对象并进行赋值调用
//对象是真实存在的具体实例

public class PhoneTest {
    public static void main(String[] args) {
        //如何得到类的对象

        //创建手机对象
        //类名 对象名 = new 类名()
        Phone p = new Phone();

        //给手机赋值
        p.brand = "小米";
        p.price = 1999.98;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

       //调用手机中的方法
       p.call();
       p.playGame();

       //创建第二部手机
        Phone p2 = new Phone();
        p.brand = "Apple";
        p.price = 8999;
        p2.call();
        p2.playGame();

    }
}



