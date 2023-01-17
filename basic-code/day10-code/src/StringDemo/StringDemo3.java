package StringDemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1. 假设键盘录入"abc"
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str1 = sc.next(); //abc  是new出来的，不是说直接赋值的

        //代码定义字符串"abc"
        String str2 = "abc";

        //比较
        System.out.println(str1 == str2); //false
        System.out.println(str1.equals(str2)); //true

    }
}
