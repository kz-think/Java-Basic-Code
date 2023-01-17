package dowhileDemo;

public class dowhileDemo1 {
    public static void main(String[] args) {
        //while的格式
        /*
        初始化语句;
        do {
            循环体语句;
            条件控制语句;
        } while (条件判断语句);
        */

        int i = 0;
        do {
            i++;
        } while (i<=5); //判断在最后，就算达到也会再多循环一次

        System.out.println(i); //6
    }
}
