import java.util.Scanner;

//不能用乘法，除法和取余，求出两数的商和余数
public class Leetcode02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the dividend");
        int dividend = sc.nextInt();
        System.out.println("Please enter the divider");
        int divider = sc.nextInt();

        int quotient = 0;

        while (dividend >= divider) {
            dividend = dividend - divider;
            quotient++;
        }

        int remainder = dividend;

        System.out.println("The quotient is " + quotient);
        System.out.println("The remainder is " + remainder);
    }
}
