package StringDemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //遍历字符串

        //public char charAt(int index): 根据索引返回字符
        //public int length(): 返回此字符串的长度
        //字符串对象.length(): 字符串的长度

        //1. 键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String:");
        String str = sc.next();

        //2. 进行遍历
        for (int i = 0; i < str.length(); i++) {
            //i 依次表示字符串的每一个索引
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
