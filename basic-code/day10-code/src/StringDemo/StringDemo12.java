package StringDemo;

import java.util.Scanner;

public class StringDemo12 {
    public static void main(String[] args) {
        String[] capNum = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        String[] numUnit = {"佰","拾","万","千","佰","拾","元",};

        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请录入金额：");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            }else {
                System.out.println("金额无效，请重新录入：");
            }
        }

        String moneyStr = String.valueOf(money);
        String temp = moneyStr;
        for (int i = 0; i < 7 - temp.length(); i++) {
            moneyStr = "0" + moneyStr;
        }


        System.out.println(Character.toString((char)moneyStr.charAt(5)));
        System.out.println((char)moneyStr.charAt(5));
        System.out.println(Character.getNumericValue((char)moneyStr.charAt(5)));

        String digitStr = "";
        int intDigitStr;

        for (int i = 0; i < 7; i++) {
            digitStr = Character.toString((char)moneyStr.charAt(i));
            intDigitStr = Character.getNumericValue((char)moneyStr.charAt(i));
            System.out.println(intDigitStr);
            moneyStr = moneyStr.replace(digitStr,capNum[intDigitStr]+numUnit[i]);
        }


        System.out.println(moneyStr);

    }
}
