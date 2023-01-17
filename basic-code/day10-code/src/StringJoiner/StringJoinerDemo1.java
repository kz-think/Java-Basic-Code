package StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //StringJoiner的构造方法

        //StringJoiner(间隔符号）/ StringJoiner(间隔符号，开始符号，结束符号）
        StringJoiner sj = new StringJoiner(",","[","]");

        //添加元素
        sj.add("a");
        sj.add("b").add("c");
        System.out.println(sj); //[a,b,c]

        //长度
        sj.length();

        //toString
        sj.toString();
    }
}
