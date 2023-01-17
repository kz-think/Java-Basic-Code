package methodDemo;

public class methodDemo2 {
    public static void main(String[] args) {
        sum(1,2); //放置实际参数，方法调用时的参数
        //打印 3 （1+2）
    }

    //定义带参数的方法
    //在方法中放置形式参数（方法定义中的参数）
    public static void sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }
}
