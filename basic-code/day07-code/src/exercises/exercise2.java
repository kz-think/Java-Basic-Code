package exercises;

public class exercise2 {
    public static void main(String[] args) {
        //求101~200间有多少个素数
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                count++;
                System.out.println(i);
            }

        }

        System.out.println();
        System.out.println("101~200间有 " + count +" 个质数");
    }
}
