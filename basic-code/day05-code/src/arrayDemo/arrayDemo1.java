package arrayDemo;

public class arrayDemo1 {
    public static void main(String[] args) {
        //数组array的格式

        //简化写法
        int[] array1 = {1, 2, 3};
        double array2 [] = {1.1, 2, 3.3};

        //传统写法
        char[] array3 = new char[] {'a', 'b', 'c'};
        String array4 [] = new String[] {"ab","cd","ef"};

        System.out.println(array1); //[I@776ec8df (地址值）
        System.out.println(array2); //[D@4eec7777 (地址值）
        System.out.println(array3); //123 （直接打印）
        System.out.println(array4); //[Ljava.lang.String;@3b07d329 (地址值）

        //地址值
        //表示数组在整个地址中的位置
        //[ : 表示当前为一个数组
        //I ：表示当前为int类型
        //@ : 间隔符号，固定格式
        //776ec8df ：数组真正的地址值

        //用索引访问数组中的数据
        //1.获取数组里的元素
        int arr1 = array1[0];
        System.out.println(arr1); // 1
        System.out.println(array4[2]); // ef

        //2.把数据存储到数组中
        array2[0] = 4.4; //将4存储到0位置，覆盖掉1
        System.out.println(array2[0]); //4.4

        //数组的遍历，获取数组中的所有元素
        //循环方法，不是最优方法
        for (int i = 0; i < 3; i++) {  //使用3.fori快捷方式，3为数组中的数据个数
            //i: 0, 1, 2
            System.out.println(array4[i]); //abcdef
        }

        //数组的长度属性方法
        //调用方式：数组名.length
        System.out.println(array3.length); //3
        for (int i = 0; i < array3.length; i++) { //使用array.length.fori
            System.out.println(array3[i]); //abc
        }

    }
}
