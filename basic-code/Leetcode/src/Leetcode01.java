import java.util.Scanner;

//求证是否为回文数 e.g. 12321
public class Leetcode01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an int");
        int num = sc.nextInt();
        int numOriginal = num;
        int numReverse = 0;

        //1%10 余 1
        while (num != 0) {
            int digit = num % 10; //分出每位数，从个位开始
            num /= 10; //将数值减去个位，int不保留小数点
            numReverse = numReverse*10 + digit; //创建reverse数值
        }


        if (numOriginal == numReverse) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }






    }
}
