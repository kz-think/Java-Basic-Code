package skipLoopDemo;

public class skipLoopDemo1 {
    public static void main(String[] args) {
        //跳过某一次循环
        for (int i = 1; i <=5; i++) {
            if(i == 3){
                continue; //结束本次循环，继续下次循环
            }
            System.out.println(i); // 1,2,4,5
        }

        System.out.println("");

        //在某一点结束循环
        for (int i = 1; i <=5; i++) {
            if(i == 3){
                break; //结束循环
            }
            System.out.println(i); // 1,2
        }

        System.out.println(79%100);

    }
}
