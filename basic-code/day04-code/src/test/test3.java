package test;

public class test3 {
    public static void main(String[] args) {
        //珠穆拉玛峰=8844430mm
        //纸张厚度=0.1mm
        //折叠多少次能到珠穆拉玛峰的高度

        //用for写
        int count1 = 0;
        for (double i = 0.1 ; i < 8844430 ; i *= 2) {
            count1++;
        }
        System.out.println(count1);

        System.out.println("");

        //用while写
        int count2 = 0;
        double i = 0.1;
        while (i < 8844430) {
            i *= 2;
            count2++;
        }
        System.out.println(count2);
    }
}
