package test;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        //验证是否为质数
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an int:");
        int num = sc.nextInt();

        boolean flag = true;

        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("不是一个质数");
                flag = false;
                break;
            }
        }

        if (flag == true) {
            System.out.println("是一个质数");
        }




    }
}
