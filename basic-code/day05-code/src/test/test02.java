package test;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        //求平方根
        int count = 0;

        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter an int");
        int num = sc.nextInt();

        for(int i = 1; i < num; i++) {
            if (i*i == num) {
                System.out.println(i);
                break;
            } else if (i*i > num) {
                System.out.println(i-1);
                break;
            }
        }
    }
}
