package test;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        //优化验证质数算法

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an int:");
        int num = sc.nextInt();

        boolean flag = true;

        for(int i = 2; i <= Math.sqrt(num); i++) { //用平方根，简化步骤，优化算法
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
