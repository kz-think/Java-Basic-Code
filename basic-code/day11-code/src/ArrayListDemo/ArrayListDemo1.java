package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //集合长度可变，可以自动扩容
        //集合不能直接存基本数据类型
        //如果要存储基本数据类型需要把它们变成包装类

        //创建集合
        //泛型<>，用来限定集合中存储数据的类型
        //ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>(); //只能存储String的ArrayList,JDK7之后后面的泛型可以省略

         //添加元素
        boolean result1 = list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(result1); //true

        System.out.println(list); //[aaa,aaa,bbb,ccc]


        //删除元素
        boolean result2 = list.remove("aaa");
        boolean result3 = list.remove("eee");
        System.out.println(result2); //true
        System.out.println(result3); //false, 删除不存在元素时返回false

        String str1 = list.remove(2); //list.remove(int index) 返回值为被删除的String
        System.out.println(str1); //ccc

        System.out.println(list); //[aaa,bbb]

        //修改索引
        String str2 = list.set(0,"ddd"); //原在0索引的aaa被覆盖了
        System.out.println(str2); //aaa, 返回被修改，被覆盖的索引
        System.out.println(list); //[ddd,bbb]

        //查询索引
        list.get(0); //ddd

        //获取集合的长度
        int size = list.size(); //2

        for (int i = 0; i < list.size(); i++) { //遍历集合
            String str3 = list.get(i);
            System.out.println(str3);
        }






    }
}
