package StringDemo;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        //1. 键盘录入金额
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

        //赋值一个空String
        String capMoney = "";
        //2. 得到money里的每一位数字
        while(true){
            //从右往左获取数据
            if (money == 0) {
                break;
            }
            int digit = money % 10;
            money = money / 10;
            String capitalNumber = getCapitalNumber(digit);
            capMoney = capitalNumber + capMoney;
        }

        //3.补零
        int count = capMoney.length();
        for (int i = 0; i < (7 - count); i++) {
            capMoney = "零" + capMoney;
        }

        //4.补单位
        //定义一个数组表示单位
        String[] arr = {"佰","拾","万","千","佰","拾","元",};
        //定义一个新的空String储存最终结果
        String result = "";
        for (int i = 0; i < capMoney.length(); i++) {
            char c = capMoney.charAt(i);
            result += c;
            result += arr[i];
        }

        System.out.println(result);

    }

    public static String getCapitalNumber(int number){
        //定义数组
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};

        //返回结果
        return arr[number];
    }
}


