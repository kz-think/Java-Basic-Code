package arrayDemo;

public class arrayDemo2 {
    public static void main(String[] args) {
        //数组的动态初始化
        //初始化只指定数组长度，由系统分配初始值
        int[] arr1 = new int[3]; //新定义的内含三个元素的int类型数组

        //数组默认初始化的值（规律）
        //int：0
        //double： 0.0
        //char：'/u0000' （就是一个空格）
        //boolean：false
        //引用数据类型（比如String）：null

        //场景1
        //一个用来存放50个学生姓名的数组，等学生报道后再添加姓名
        String[] arr2 = new String[50];
        //添加学生信息
        arr2[0] = "Kevin";
        arr2[32] = "Lisa";
        System.out.println(arr2[0]); // Kevin
        System.out.println(arr2[32]); // Lisa
        System.out.println(arr2[5]); // null

        //静态初始化与动态初始化的区别
        //只明确元素个数，不明确数值，使用动态初始化
        //明确所有数值，使用静态初始化

    }
}
