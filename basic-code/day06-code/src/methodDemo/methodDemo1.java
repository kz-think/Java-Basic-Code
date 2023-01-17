package methodDemo;

public class methodDemo1 {
    public static void main(String[] args) {
        //方法是程序中最小的执行单元
        //重复的，或具有独立功能的代码可以打包到方法中
        //方法可以提高代码的复用性

        //调用方法的格式：
        a(); //此处调用了方法，会执行方法中所有的代码
        System.out.println("c");
        a(); //可以调用多次，会重复执行方法内的代码
        b(); //使用a()后此方法输出结果为 ab
        //输出结果 acaab
    }

    //定义无参数的方法
    public static void a() {
        System.out.println("a"); //当没有调用时，不会执行代码
    }

    public static void b() {
        a(); //方法中可以嵌套方法无所谓创建顺序
        System.out.println("b");
    }


}
