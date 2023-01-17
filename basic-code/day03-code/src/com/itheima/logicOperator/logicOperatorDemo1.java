package com.itheima.logicOperator;

public class logicOperatorDemo1 {
    public static void main(String[] args) {
        //逻辑运算符
        //&：逻辑与（且）  并且，两边都为真，结果才是真
        //|：逻辑或        或者，两边都为假，结果才是假
        //^：逻辑异或      相同为false，不同为true
        //！：逻辑非       相同为true，不同为false

        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        System.out.println(a&b); //true
        System.out.println(d|c); //false
        System.out.println(a^b); //false
        System.out.println(a^c); //true


    }
}



