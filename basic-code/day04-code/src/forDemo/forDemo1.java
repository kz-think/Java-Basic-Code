package forDemo;

public class forDemo1 {
    public static void main(String[] args) {
        //循环的类型

        //for循环的格式
        /*
        for (初始化语句;条件判断语句;条件控制语句) {
            循环体语句;
        }
        */

        for (int i =1 ; i <= 10 ; i++ ) {
            System.out.println(i);
        }

        System.out.println("");

        int i = 5; //变量可以写在for循环外面，之后可以被使用
        for ( ; i >= 1 ; i-- ) {
            System.out.println(i);
        }

    }
}



