package test;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        //比较两个长方形的面积

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("Please enter the length of the first rectangle");
            double len1 = sc1.nextDouble();
            System.out.println("Please enter the width of the first rectangle");
            double width1 = sc1.nextDouble();
            System.out.println("Please enter the length of the second rectangle");
            double len2 = sc1.nextDouble();
            System.out.println("Please enter the width of the second rectangle");
            double width2 = sc1.nextDouble();

            System.out.println("");

            if (area(len1,width1) > area(len2,width2)) {
                System.out.println("The first rectangle is bigger!");
            } else if (area(len1,width1) < area(len2,width2)) {
                System.out.println("The second rectangle is bigger!");
            } else {
                System.out.println("They are the same size!");
            }

            System.out.println("");

            System.out.println("Do you want to continue?");
            String answer = sc2.nextLine();

            System.out.println("");

            //下面这段不行，要修改
            if (answer == "yes") {
                flag = true;
            } else if (answer == "no") {
                System.out.println("");
                System.out.println("Thank you for using our program!");
                flag = false;
            }
        }

    }

    public static double area(double len, double width) {
        double area = len * width;
        return area;
    }
}
