package test;

public class test03 {
    public static void main(String[] args) {
        //求数组的最大值
        int[] arr1 = {1,2,3,4,5};
        System.out.println("The max number of the array is "+maxArr(arr1));
    }

    public static int maxArr(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
