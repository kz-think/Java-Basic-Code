package StringBuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //StringBuilding - 可以看作是一个容器，创建之后里面的内容是可变的
        //作用： 提高字符串的操作效率

        //创建StringBuilder对象
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb); //打印StringBuilder不是地址值而是属性值（内容）

        //添加元素
        sb.append(1);
        sb.append(true);
        sb.append(2.3);
        sb.append("ttt");
        System.out.println(sb);

        //反转容器中的内容
        sb.reverse();
        System.out.println(sb);

        //返回长度
        System.out.println(sb.length());

        //把StringBuilder转换成String
        String sbStr = sb.toString();
        System.out.println(sbStr);
    }
}
