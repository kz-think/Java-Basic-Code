package ifDemo;

import java.util.Scanner;

public class ifDemo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an int");
        int a = sc.nextInt();

        //if的格式：
        if (a > 0) {
            System.out.println("a>0");

        }

        //在语句体种，如果只有一行代码，大括号可以省略不写，但是不要这么做
        if (a > 1) System.out.println("a>1");

        //如果对Boolean进行判断，不要用==
        boolean b = true;
        boolean c = false;
        if (b) {
            System.out.println("b = true"); //will print
        }
        if (c) {
            System.out.println("c = true"); //don't print
        }


    }
}
