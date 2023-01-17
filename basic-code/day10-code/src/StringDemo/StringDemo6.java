package StringDemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        //统计大写字母，小写字母，数字出现的次数

        //1. 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String");
        String str = sc.next();

        //2. 统计 --- 计数器思想
        //定义三个计数器
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z') {
                lowercaseCount++;
            } else if (c >= 'A' && c <= 'Z') {
                uppercaseCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }

        //3. 输出打印
        System.out.println("There are " + uppercaseCount + " upperCases");
        System.out.println("There are " + lowercaseCount + " lowerCases");
        System.out.println("There are " + numberCount + " numbers");
    }



}
