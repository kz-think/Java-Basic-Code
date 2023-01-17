package test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //求1-5的和
        int sum1 = 0; //求和变量不能定义在for里面
        for (int i = 1; i <= 5; i++) {
            sum1 = sum1 + i;
        }
        System.out.println(sum1); //如果变量定义在for里面，只会在本次循环中有效

        // 求100内偶数和第一种写法
        int sum2 = 0;
        for (int i = 2; i <= 100; i=i+2) {
            sum2 = sum2 + i;
        }
        System.out.println(sum2);

        //求100内偶数和第二种写法
        int sum3 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum3 = sum3 + i;
            }
        }
        System.out.println(sum3);

        //键盘录入两个数字，统计两个数字范围内能被3，5整除的数字有多少个
        int sum4 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first int to define lower range:");
        int lowerRange = sc.nextInt();
        System.out.println("Please enter the first int to define higher range:");
        int higherRange = sc.nextInt();

        for (int i = lowerRange; i <= higherRange ; i++) {
            if (i%3 == 0 && i%5 == 0) {
                sum4++;
            }
        }

        System.out.println(sum4);

    }

}
