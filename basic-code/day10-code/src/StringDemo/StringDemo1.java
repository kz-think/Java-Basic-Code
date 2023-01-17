package StringDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1. 使用直接赋值创建字符串对象
        String s1 = "abc";
        System.out.println(s1);

        //2. 使用new方式来获取一个字符串对象
        //#空参构造： 可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println(s2);

        //#传递一个字符串，根据传递的字符串内容再创建一个字符串对象
        String s3 = new String("abc");
        System.out.println(s3);

        //3. 传递一个字符数组
        //需求：可以修改字符串的内容
        char[] chs = {'a','b','c'};
        String s4 = new String(chs);
        System.out.println(s4);

        //4. 传递一个字节数组
        //需求：以后在网络中传输的都是字节信息
        byte[] bytes = {97,98,99};
        String s5 = new String(bytes);
        System.out.println(s5);


    }
}
