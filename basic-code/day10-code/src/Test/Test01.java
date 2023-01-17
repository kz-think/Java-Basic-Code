package Test;

import java.util.Scanner;

//阿拉伯数字转罗马数字
public class Test01 {
    public static void main(String[] args) {
        String Str = getString();
        String result = arabicToRome(Str);
        System.out.println(result);
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        String str;

        while (true) {
            System.out.println("Please enter your number:");
            str = sc.next();
            if (str.length() <= 9 && isNumeric(str) == true) {
                break;
            }
            System.out.println("The number you enter is incorrect, please re-enter:");
        }

        return str;
    }

    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    public static String arabicToRome(String str) {
        String[] arr = {" ","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        StringBuilder sb = new StringBuilder();
        //第一种转换方式
        char c;
        int index;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            index = c - 48;
            sb.append(arr[index]);
        }

        return sb.toString();
    }

    //第二种转换方式 (利用switch进行匹配）
    public static String switchArabicToRome(char number) {
        //传统switch写法
        /*
        String str;
           switch (number) {
            case '0' -> str = " ";
            case '1' -> str = "Ⅰ";
            case '2' -> str = "Ⅱ";
            case '3' -> str = "Ⅲ";
            case '4' -> str = "Ⅳ";
            case '5' -> str = "Ⅴ";
            case '6' -> str = "Ⅵ";
            case '7' -> str = "Ⅶ";
            case '8' -> str = "Ⅷ";
            case '9' -> str = "Ⅸ";
            default -> str = "";
        }*/

        //JDK12新写法
        String str = switch (number) {
            case '0' -> " ";
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> str = "";
        };

        return str;
    }

}
