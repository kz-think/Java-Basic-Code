package exercises;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        //机票价格计算

        //询问信息
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the original price?");
        double price = sc.nextDouble();
        System.out.println("What is the current month?");
        int month = sc.nextInt();
        System.out.println("What class do you want to purchase? (0 means ecoonomy, 1 means first)");
        int grade = sc.nextInt();

        //输出最终价格
        System.out.println();
        System.out.println("The price of your ticket is "+ticketPrice(price, month, grade));
    }

    //计算价格
    public static int priceCalc(double price, int grade, double discountE, double discountF) {
        int newPrice = 0;
        if (grade == 0) {
            newPrice = (int) (price * discountE);
        } else if (grade == 1) {
            newPrice = (int) (price * discountF);
        }
        return newPrice;
    }
    public static double ticketPrice(double price, int month, int grade) {
        double newPrice = 0;
        if (month >= 5 && month <=10) {
            newPrice = priceCalc(price, grade, .85, .9);
        } else {
            newPrice = priceCalc(price, grade, .65, .7);
        }
        return newPrice;
    }


}
