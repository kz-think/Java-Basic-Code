package arithmeticOperatorDemo;

public class arithmeticoperatorDemo3 {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        int result = b1 +b2;
        System.out.println(result);
        result = (byte) (b1+b2);
        System.out.println(result);

        byte b3 = 100;
        int b4 = 200;
        byte result2 = (byte) (b3 +b4);
        System.out.println(result2);
    }
}
