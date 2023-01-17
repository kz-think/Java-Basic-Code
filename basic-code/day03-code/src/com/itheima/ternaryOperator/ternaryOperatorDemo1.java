package com.itheima.ternaryOperator;

import java.util.Scanner;

public class ternaryOperatorDemo1 {
    public static void main(String[] args) {
        //格式：关系表达式 ？ 表达式1 ：表达式2；
        //整个三元运算符的结果必须要被使用

        /*
        范例：求两个数最大值
        a > b ? a : b
        当a>b成立时，输出a
        当a>b不成立时，输出b
         */

        /*
        a > b ? c : d
        当a>b成立时，输出c
        当a>b不成立时，输出d
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter int 1");
        int a = sc.nextInt();
        System.out.println("Please enter int 2");
        int b = sc.nextInt();

        int max = a>b ? a : b;
        System.out.println("Here is the max int:");
        System.out.println(max);

        int min = a<b ? a : b;
        System.out.println("Here is the min int:");
        System.out.println(min);
    }
}
