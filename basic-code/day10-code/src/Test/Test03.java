package Test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        String a = getString();
        char[] arr = strToArr(a);
        char[] carr = changedArr(arr);
        System.out.println(carr);
    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number:");
        String str = sc.next();
        return str;
    }

    public static char[] strToArr(String str) {
        char[] arr = str.toCharArray();
        return arr;
    }

    public static char[] changedArr(char[] arr){
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


}
