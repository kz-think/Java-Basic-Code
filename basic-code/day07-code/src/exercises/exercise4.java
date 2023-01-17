package exercises;

public class exercise4 {
    public static void main(String[] args) {
        //把一个数组里的元素复制到新的数组

        int num1[] = {1,2,3,4,5};
        int num2[] = new int[num1.length];

        for (int i = 0; i < num1.length; i++) {
            num2[i] = num1[i];
            System.out.print(num2[i]);
        }

    }
}
