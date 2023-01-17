package test;

public class test07 {
    public static void main(String[] args) {
        //求最值
        int[] arr1 = {33,5,22,55,44};

        int max = arr1[0]; //定义记录最大值的变量，一定要是数组中的值

        for (int i = 0; i < arr1.length; i++) { //如果优化的话可以改成i=1，就不用自己与自己比较
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }

        System.out.println(max); //55
    }
}
