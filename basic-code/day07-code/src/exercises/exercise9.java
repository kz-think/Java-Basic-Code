package exercises;

import java.util.Random;
import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        prizeNumArr();
        System.out.println();
        betNumArr();
        //双色球彩票投注与开奖系统




    }

    //开奖号码生成
    public static int[] prizeNumArr () {
        Random r = new Random();
        int[] prizeNumArr = new int[7];
        for (int i = 0; i < 7; i++) {
            if(i < 6) {
                int redNumSingle = r.nextInt(1,34);
                prizeNumArr[i] = redNumSingle;
            } else {
                int blueNumSingle = r.nextInt(1,16);
                prizeNumArr[i] = blueNumSingle;
            }
        }

        for (int i = 0; i < prizeNumArr.length; i++) {
            System.out.print(prizeNumArr[i]+" ");
        }

        return prizeNumArr;
    }

    //投注系统
    public static int[] betNumArr () {
        int[] betNumArr = new int[7];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 7;) {
            if (i < 6) {
                System.out.println("Please bet red ball " + (i+1));
                int betRed = sc.nextInt();
                if (betRed >= 1 && betRed <= 33) {
                    betNumArr[i] = betRed;
                    i++;
                } else {
                    System.out.println("The number you bet is out of range, please re-bet");
                }
            } else {
                System.out.println("Please bet blue ball");
                int betBlue = sc.nextInt();
                if (betBlue >= 1 && betBlue <= 16) {
                    betNumArr[i] = betBlue;
                    i++;
                } else {
                    System.out.println("The number you bet is out of range, please re-bet");
                }
            }
        }

        for (int i = 0; i < betNumArr.length; i++) {
            System.out.print(betNumArr[i]+" ");
        }

        return betNumArr;
    }

    //开奖系统
    public static String prizeReveal (int[] prizeNumArr, int [] betNumArr) {
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i <7; i++) {
            if (i <= 5) {
                if (prizeNumArr[i] == betNumArr[i]) {
                    redCount++;
                }
            } else {
                if (prizeNumArr[i] == betNumArr[i]) {
                    blueCount++;
                }
            }
        }
        
        if (blueCount == 0) {
            if (redCount == 6) {
                System.out.println("You have won the 1st prize");
            } else if (redCount == 5) {
                System.out.println("You have won the 3rd prize");
            } else if (redCount == 4) {
                
            }
        }
        
    }

}
