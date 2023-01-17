package switchDemo;

import java.util.Scanner;

public class switchDemo1 {
    public static void main(String[] args) {
        //switch的格式：
        //case后面的值只能是字面量，不能是变量
        //default位置可以任意，也可以省略（不建议）
        //break不能省略，会导致case穿透，所有case会被执行


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想吃的面");
        String noodle = sc.nextLine();

        /*
        switch (noodle) {
            //第一种写法
            case "担担面" :
                System.out.println("吃担担面");
                break;

            //第二种写法
            case -> "炸酱面" {
                System.out.println("吃炸酱面");
            }

            //第三种写法，只适用于一个表达语句
            case "热干面" -> System.out.println("吃热干面");

            //第四种写法，case后的值可以用逗号分割
            case "兰州拉面"，"日本拉面" :
                System.out.println("吃拉面");
                break;

            //同第一种写法
            default:
                System.out.println("没这个面，吃泡面吧");
                break;
         */

        }

    }

