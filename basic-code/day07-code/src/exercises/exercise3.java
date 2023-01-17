package exercises;

import java.util.Random;

public class exercise3 {
    public static void main(String[] args) {
        //定义方法实现随机产生一个五位验证码
        // 前四位为大写字母或者小写字母，最后一位是数字

        //打印字母表
        printChs();
        System.out.println();

        //输出1
        System.out.println("Your verification code is " +  rVerificationCode1());

        //输出2
        System.out.println("Your verification code is " + rVerificationCode2());
    }

    //自己的方法
    public static String rVerificationCode1() {
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int chaNum = r.nextInt(65, 123);
            while (chaNum >= 91 && chaNum <= 96) {
                chaNum = r.nextInt(65, 123);
            }
            result += (char)(chaNum);
        }
        int num = r.nextInt(0, 10);
        result += (num);
        return result;
    }

    //老师的方法
    public static String rVerificationCode2() {
        Random r = new Random();
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char)(97+i);
            } else {
                chs[i] = (char)(39+i);
            }
        }

        String result = "";

        //随机抽取4次字母并储存
        for (int i = 0; i < 4; i++) {
            int charIndex = r.nextInt(0,52);
            result += chs[charIndex];
        }

        //随机抽取1次数字并储存
        int num = r.nextInt(0, 10);
        result += num;

        //返回result
        return result;
    }

    //打印字母表
    public static void printChs() {
        Random r = new Random();
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char)(97+i);
            } else {
                chs[i] = (char)(39+i);
            }
        }

        for (int i = 0; i < 52; i++) {
            System.out.print(chs[i]+" ");
        }

    }
}
