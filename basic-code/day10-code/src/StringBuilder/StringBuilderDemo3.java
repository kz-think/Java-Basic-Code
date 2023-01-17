package StringBuilder;

import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //键盘接受字符串，判断该字符串是否为对称字符串
        //正着和反着是一样的

        String str = getString();
        StringBuilder sb = new StringBuilder(str);
        String strReverse = sb.reverse().toString();

        if (str.equals(strReverse)) {
            System.out.println("这是一个对称字符串");
        } else {
            System.out.println("这不是一个对称字符串");
        }

    }

    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        return str;
    }
}
