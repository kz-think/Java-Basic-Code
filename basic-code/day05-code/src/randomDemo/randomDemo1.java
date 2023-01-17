package randomDemo;

import java.util.Random;

public class randomDemo1 {
    public static void main(String[] args) {
        //random的使用方法及格式
        Random r = new Random();

        for (int i = 0; i < 100; i++) { //快捷方式：100.fori
            int num = r.nextInt(1,100); // 范围1~99
            System.out.println(num);
        }

        //秘诀
        //用来生成任意数字到数字之间的随机数 7~15
        //1. 让这个范围头尾减去一个值，假设从0开始 -7
        //2. 尾巴+1     8 + 1 = 9
        //3. 最终的结果，再加第一步减去的值

        int num2 = r.nextInt(9); // 范围0~8
        num2 += 7; //加上减去的值
        System.out.println(num2); //得到7~15随机数
    }
}
