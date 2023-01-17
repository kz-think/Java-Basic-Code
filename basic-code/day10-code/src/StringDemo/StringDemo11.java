package StringDemo;

import java.util.Scanner;

public class StringDemo11 {
    public static void main(String[] args) {
        //查看身份证信息

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        Long id;
        while (true) {
            System.out.println("请输入身份证:");
            id = sc.nextLong();
            if (String.valueOf(id).length() != 18) {
                System.out.println("身份证号无效，请重新录入：");
            }else {
                break;
            }
        }

        String idStr = String.valueOf(id);

        System.out.println("");
        System.out.println("人物信息为:");
        System.out.println("出生年月日：" + idStr.substring(6,10) + "年" + idStr.substring(10,12) + "月" + idStr.substring(12,14) + "日");
        if ((int)idStr.charAt(16) % 2 == 0) {
            System.out.println("性别为：女");
        } else {
            System.out.println("性别为：男");
        }

        System.out.println((int)idStr.charAt(16));

    }
}
