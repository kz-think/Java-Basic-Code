package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*键盘录入两整数
        如果其中一个为6，输出true
        如果他们的和为6的背书，输出true
        其他情况为false
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数");
        int a = sc.nextInt();

        System.out.println("请输入另一个整数");
        int b = sc.nextInt();

        boolean result = (a==6 || b==6) || ((a+b)%6 == 0);

        System.out.println(result);



    }
}
