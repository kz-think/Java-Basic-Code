package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*数值拆分公式
        个位：数值 %10
        十位：数值/10 %10
        百位：数值/100 %10
        千位：数值/1000 %10 （最大位数可不%10）
        ......
         */

        //键盘录入一个三位数，获取其中的各位，百位，十位

        //1.键盘录入 Scanner
        Scanner sc = new Scanner(System.in);

        //2.提示用户输入
        System.out.println("请输入一个三位数");

        //3.接收输入信息并赋值给variable
        int number = sc.nextInt();

        //4.获取个位十位百位
        int single = number % 10;
        int tenth = number / 10 %10;
        int hundredth = number / 100 % 10;

        //5.打印答案
        System.out.println("");
        System.out.println(single);
        System.out.println(tenth);
        System.out.println(hundredth);

    }
}
