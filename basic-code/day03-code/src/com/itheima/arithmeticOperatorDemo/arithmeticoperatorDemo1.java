package arithmeticOperatorDemo;

public class arithmeticoperatorDemo1 {
    public static void main(String[] args) {

        //运算符

        //加法
        System.out.println(3+2);
        System.out.println(1.1+1.01); //2.1100000000000003
        //在代码中，如果小数参与计算结果有可能不精确

        //减法
        System.out.println(5-1); //4

        //乘法
        System.out.println(7*9); //63

        //除法
        System.out.println(10/3); //3
        System.out.println(10.0/3); //3.3333333333333335
        //整数参与计算，只会有整数
        //小数参与计算，有可能不精确

        //取模（取余数）
        System.out.println(10%2); //0
        System.out.println(10%3); //1

        /*数值拆分公式
        个位：数值 %10
        十位：数值/10 %10
        百位：数值/100 %10
        千位：数值/1000 %10 （最大位数可不%10）
        ......
         */
    }
}
