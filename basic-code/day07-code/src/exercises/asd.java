package exercises;

import java.util.Scanner;

public class asd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the password you want to convert:");
        int ogPass = sc.nextInt();
        int passLen = String.valueOf(ogPass).length(); //得到int的length的方法

        int[] ogPassArr = new int[passLen];

        //Convert to Array
        for (int i = (passLen-1) ,j = 1; i >= 0; i--, j *= 10) {
            ogPassArr[i] = (ogPass/j) % 10;
        }

        for (int i = 0; i < passLen; i++) {
            System.out.print(ogPassArr[i]);
        }
    }


}
