package methodDemo;

public class methodDemo3 {
    public static void main(String[] args) {
        //直接调用
        sum(1,2); //不会打印

        //赋值调用
        int sum1 = sum(1,2); //定义一个变量去储存方法return的结果
        System.out.println(sum1); //输出方法的结果

        int sum2 = sum(2,3); //不会输出, sum2 = 5

        System.out.println(sum1 + sum2); //输出 3 + 5 = 8

        //输出调用
        System.out.println(sum(1,2)); //会输出方法的结果
    }

    //定义带返回值的method
    public static int sum(int a, int b) {
        int result = a + b;
        return result; //返回方法的最终结果
    }
}
