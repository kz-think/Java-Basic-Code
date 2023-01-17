package exercises;

import java.util.Random;

public class exercise8 {
    public static void main(String[] args) {
        //随机抽奖

        int[] prizeArr = {2, 588, 888, 1000, 10000};

        //输出结果
        randomizedArr(prizeArr);
        for (int i = 0; i < prizeArr.length; i++) {
            System.out.print(prizeArr[i]+" ");
        }
    }

    //Randomize Array
    public static int[] randomizedArr(int[] prizeArr) {
        Random r = new Random();
        for (int i = 0; i < prizeArr.length; i++) {
            int randomIndex = r.nextInt(prizeArr.length);
            int temp = prizeArr[i];
            prizeArr[i] = prizeArr[randomIndex];
            prizeArr[randomIndex] = temp;
        }
        return prizeArr;
    }





}
