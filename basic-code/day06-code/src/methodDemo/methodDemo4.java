package methodDemo;

public class methodDemo4 {
    public static void main(String[] args) {
        //方法的重载
        //在同一个类中，可以有方法名不同，参数不同的方法。与类型和返回值无关
        System.out.println(sum(1,1)); // 2
        System.out.println(sum(1.12,1.23)); // 2.35
        System.out.println(sum(1,(byte)1,2.3)); //2.0
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static double sum(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static double sum(int a, byte b, double c) {
        double sum = a + b;
        return sum;
    }

}
