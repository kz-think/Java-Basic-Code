package Test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("Please enter the string you want to change:");
        String a = getString();
        System.out.println("Please enter the string you want to compare with:");
        String b = getString();
        System.out.println(compareStr(a,b));
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        return str;
    }

    public static char[] strToArr(String str) {
        char[] arr = str.toCharArray();
        return arr;
    }

    public static char[] rotateArr(char[] arr){
        char[] changedArr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1){
                changedArr[i] = arr[i+1];
            } else {
                changedArr[i] = arr[0];
            }
        }
        return changedArr;
    }

    public static boolean compareStr(String a, String b) {
        char[] aArr = strToArr(a);
        char[] bArr = strToArr(b);
        boolean flag = true;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < aArr.length; j++) {
                if (aArr[j] != bArr[j]) {
                    flag = false;
                } else {
                    flag = true;
                }
            }
            if (flag == true){
                return true;
            }
            aArr = rotateArr(aArr);
        }
        return false;
    }

}
