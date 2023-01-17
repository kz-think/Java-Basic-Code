package exercises;

import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        //6位评委打分，范围0~100，去掉最低和最高分
        //算出剩下4个评委的平均分

        //定义数组用来存储分数
        int[] score= new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length;) {
            System.out.println("Please enter score " + (i+1));
            int singleScore = sc.nextInt();
            if (singleScore <= 100 && singleScore >= 0) {
                score[i] = singleScore;
                i++; //将i++放在for外面来防止输入错误
            } else {
                System.out.println("The score you entered is out of range, please re-enter");
            }
        }

        //输出结果
        System.out.println("The average score without max and min is " + averageScore(score));
    }

    //创建method来计算平均分
    public static int averageScore(int[] score){
        int max = score[0];
        int min = score[0];
        int sumScore = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < max) {
                min = score[i];
            }
            sumScore += score[i];
        }

        int averageScore = (sumScore - max - min)/4;

        return averageScore;
    }
}
