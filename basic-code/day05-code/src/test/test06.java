package test;

public class test06 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        //数组中的数据求和
        int sumArr1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sumArr1 += arr1[i];
        }
        System.out.println(sumArr1); //55 (1+2+3+...+100)

        //统计数组中有几个能被3整除的数字
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 3 == 0){
                count++;
            }
        }
        System.out.println("There are "+count+" numbers in the array that can be fully divided by 3");
        //3 numbers (3,6,9)

        //将数组中的奇数扩大两倍，偶数变成1/2
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] % 2 != 0) {
                arr2[i] *= 2;
            } else {
                arr2[i] /= 2;
            }
        }
        //打印结果
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }



    }
}
