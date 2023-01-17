package test;


import java.util.Random;
import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        //自动生成1~100随机数，用程序猜这个数字是多少

        //生成随机数
        Random r = new Random();
        int num = r.nextInt(1,101);
        System.out.println(num);

        Scanner sc = new Scanner(System.in);

        //让你猜数字, 使用while loop循环
        int i = 0;

        while(true) {
            if (i ==3) {
                System.out.println("You guessed three times already, the correct number is "+num);
            }
            System.out.println("Please enter the number you want to guess between 1 ~ 100");
            int numGuess = sc.nextInt();
            i++;
            if (numGuess > num) {
                System.out.println("The number you guessed is greater then the random number");
            } else if(numGuess < num) {
                System.out.println("The number you guessed is smaller then the random number");
            } else {
                System.out.println("This is the correct number!");
                break;
            }
        }


    }
}
