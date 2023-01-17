package test;

public class test02 {
    public static void main(String[] args) {
        int arr1[] = {11,22,33,44,55};
        printArr(arr1);
    }

    //定义方法用来遍历数组
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i]+","); //print 不加 Ln means 不换行
            }

        }
        System.out.print("]");
    }
}
