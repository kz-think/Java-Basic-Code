package classDemo;

//用来描述一类事物的类，叫做Javabean类
//在Javabean类中，是不写main方法的
//类是共同特征的描述（设计图）

//类名的首字母建议大写，需要见名知意，驼峰模式
//一个java文件可以定义多个class类，且只能一个类是public修饰
//public修饰的类名必须成为代码文件名

//成员变量的完整定义格式是：修饰符 数据类型 变量名称 = 初始化值
//一般无需指定初始化值，存在默认值

//如何定义类
public class Phone {

    //属性（成员变量）
    String brand;
    double price;

    //行为（成员方法）
    public void call(){
        System.out.println("手机在打电话");
    }
    public void playGame(){
        System.out.println("手机在玩游戏");
    }
}





