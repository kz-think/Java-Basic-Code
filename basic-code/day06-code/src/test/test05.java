package test;

public class test05 {
    public static void main(String[] args) {
        //复制数组
        int[] arr1 = {1,2,3,4,5};
        for (int i = 0; i < copyOfRange(arr1, 1, 4).length; i++) {
            System.out.print(copyOfRange(arr1, 1, 4)[i]);
        }
    }

    public static int[] copyOfRange (int[] arr, int from, int to) {
        int[] newArr = new int [to-from];
        for (int i = from, j = 0; i < to; i++, j++) {
            newArr[j] = arr[i];
        }
        return newArr;
    }
}
