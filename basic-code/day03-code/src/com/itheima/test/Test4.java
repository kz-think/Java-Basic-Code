package com.itheima.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //判断两只老虎体重是否相同

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the weight of tiger 1");
        int weight1 = sc.nextInt();
        System.out.println("Please enter the weight of tiger 2");
        int weight2 = sc.nextInt();

        String result = weight1 == weight2 ? "Same" : "Different";

        System.out.println("The weight of two tigers is");
        System.out.println(result);







    }
}
