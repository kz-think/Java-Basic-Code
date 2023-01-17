package test;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        //判断数组中的某一个数是否存在
        int[] arr1 = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("What number do you want to test?");
        int testNum = sc.nextInt();

        if (arrNumTest(arr1, testNum) == false) {
            System.out.println("The number " + testNum + " does not exist in the array.");
        } else {
            System.out.println("The number " + testNum + " exists in the array.");
        }
    }

    public static boolean arrNumTest(int[] arr, int testNum) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == testNum) {
                return true; //return发生时method直接中止
            }
        }
        return false;
    }

}
