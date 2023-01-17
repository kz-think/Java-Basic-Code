package com.itheima.logicOperator;

public class logicOperatorDemo2 {
    public static void main(String[] args) {

        //短路逻辑运算符
        //&&：逻辑而且  当第一个为假时，直接跳过下一个验证。两边都为真，结果才是真
        //||：逻辑或    当第一个为真时，直接跳过下一个验证。两边都为假，结果才是假

        int a = 10;
        int b = 10;
        boolean result1 = ++a < 5 && ++b < 5;
        System.out.println(result1); //false
        System.out.println(a); //11 （++a为自增1）
        System.out.println(b); //10 (短路跳过b的判断，使得++b没有执行）

        int c = 10;
        int d = 10;
        boolean result2 = ++c < 5 & ++d < 5;
        System.out.println(result2); //false
        System.out.println(a); //11
        System.out.println(b); //11 （没有短路，++b执行）

    }
}
