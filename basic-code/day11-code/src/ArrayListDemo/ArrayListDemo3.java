package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        //定义集合，添加数字

        //基本数据类型对应的包装类
        /*
        byte    Byte
        short   Short
        char    Character
        int     Integer
        long   Long
        float   Float
        double  Double
        boolean Boolean
         */

        //1. 创建集合
        ArrayList<Integer> list = new ArrayList<>();

        //2.添加元素
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //3.打印集合
        System.out.println(list);
    }
}
