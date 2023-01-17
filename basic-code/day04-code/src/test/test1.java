package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //根据不同分数送礼

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you score");
        double score = sc.nextDouble();
        if (score >= 0 && score <= 100) {

            if (score >= 95 && score <= 100) {
                System.out.println("You win a bike!");
            } else if (score >= 90 && score < 95) {
                System.out.println("You win a musical ticket!");
            } else if (score >= 80 && score < 90) {
                System.out.println("You win a pen!");
            } else {
                System.out.println("You win no prize.");
            }

        } else {
            System.out.println("You have entered a wrong number");
        }

    }
}