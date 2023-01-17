package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest2 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2. 询问想要添加几个学生
        Scanner sc = new Scanner(System.in);
        System.out.println("How many student you want to add?");
        int amount = sc.nextInt();

        //3.键盘录入学生信息并添加进集合
        for (int i = 0; i < amount; i++) {
            //键盘录入并储存为变量
            System.out.println("Please enter the name of student" + " " + (i+1));
            String stuName = sc.next();
            System.out.println("Please enter the age of student" + " " + (i+1));
            int stuAge = sc.nextInt();

            //创建学生对象
            Student s = new Student(stuName,stuAge);

            //将学生对象放入集合
            list.add(s);
        }

        //4.遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i); //储存的为地址值
            System.out.println(stu.getName()+","+stu.getAge()); //要用方法打印出地址中的元素
        }
    }
}
