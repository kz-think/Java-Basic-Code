package test;

import java.util.Random;

public class test09 {
    public static void main(String[] args) {
        //打乱数组中的数据
        //遍历数组中的数与某个数随机交换
        Random r = new Random();
        int[] arr1 = {1,2,3,4,5};
        for (int i = 0; i < arr1.length; i++) {
            int randomIndex = r.nextInt(arr1.length); //random 2
            int temp1 = arr1[i]; //temp1 = 1
            arr1[i] = arr1[randomIndex]; // arr1[0] = 3
            arr1[randomIndex] = temp1; // arr1[2] = 1
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
