package test;

public class test08 {
    public static void main(String[] args) {
        //将数组整体交换
        //方法1 （自己想的方法）
        int[] arr1 = {1,2,3,4,5};
        int[] temp1 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            temp1[i]=arr1[Math.abs(i-(arr1.length-1))];
        }

        arr1 = temp1;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]); //54321
        }

        //方法2 （老师的方法）
        int[] arr2 = {1,2,3,4,5};

        for(int i = 0, j = arr2.length-1 ; i < j; i++, j--){
            int temp2 = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp2;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]); //54321
        }
    }
}
