package StaticDemo2;

public class TestDemo1 {
    public static void main(String[] args) {
        //测试工具类中的方法
        int[] arr1 = {1,2,3,4,5};
        String str = ArrayUtil.printArr(arr1); //点一下方法名，ctrl + alt + v 自动生成变量名
        System.out.println(str); //[1,2,3,4,5]

        double[] arr2 = {1.1,2.2,3.3,4.4,5.5};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average); //3.3
    }
}
