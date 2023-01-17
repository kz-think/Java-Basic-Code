package StringDemo;

import java.util.Scanner;

public class StringDemo10 {
    public static void main(String[] args) {
        //手机号屏蔽

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        Long phone;
        while (true) {
            System.out.println("请输入手机号：");
            phone = sc.nextLong();
            if (String.valueOf(phone).length() != 11) {
                System.out.println("手机号无效，请重新录入：");
            }else {
                break;
            }
        }

        //2.创建隐藏手机号
        String phoneStr = String.valueOf(phone);
        String phoneHide = "";
        phoneHide += phoneStr.substring(0,3);
        phoneHide += "****";
        phoneHide += phoneStr.substring(7,11);


        System.out.println(phoneHide);


    }
}
