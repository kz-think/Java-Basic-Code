package exercises;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        //加密数字
        //将一串数字进行加密，得到一串新数字
        //每位数加5，再对10取余，最后将所有数字反转

        //询问原始密码
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the password you want to convert:");
        int ogPass = sc.nextInt();
        //输出结果
        System.out.println("The converted password is " + convertPass(getPassArr(ogPass)));

    }

    //1. 取得原始数字并放到数组中
    public static int[] getPassArr (int ogPass){

        int passLen = String.valueOf(ogPass).length(); //得到int的length的方法

        int[] ogPassArr = new int[passLen];

        //Convert to Array
        for (int i = (passLen-1) ,j = 1; i >= 0; i--, j *= 10) {
            ogPassArr[i] = (ogPass/j) % 10;
        }
        return ogPassArr;
    }

    //2. Covert Password
    public static String convertPass (int[] ogPassArr) {
        String result = "";
        int[] newPassArr = new int[ogPassArr.length];

        //+5 %10
        for (int i = 0; i < ogPassArr.length; i++) {
            ogPassArr[i] = (ogPassArr[i]+5) % 10;
        }

        //Reverse
        for (int i = 0; i < ogPassArr.length; i++) {
            int temp = ogPassArr[i];
            newPassArr[i] = ogPassArr[ogPassArr.length-1-i];
            result += newPassArr[i];
        }

        return result;
    }

}
