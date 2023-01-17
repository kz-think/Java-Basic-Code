package StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        //学生信息Arraylist
        ArrayList<Student> list = new ArrayList<>();

        loop: while (true) {
            //主界面
            System.out.println("-----------欢迎来到学生管理系统-----------");
            System.out.println("1: 添加学生");
            System.out.println("2: 删除学生");
            System.out.println("3: 修改学生");
            System.out.println("4: 查询学生");
            System.out.println("5: 退出");
            System.out.println("请输入您的选择：");

            //键盘录入并导航
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("系统已退出");
                    break loop;
                    //System.exit(0); 停止虚拟机运行
                }
                default -> System.out.println("没有这个选项");
            }

            System.out.println();
        }
    }

    public static void addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        while (true) {
            System.out.println("请输入学生id：");
            String id = sc.next();
            if (contains(list,id) == false) {
                s.setId(id);
                break;
            } else {
                System.out.println("id已存在，请重新录入");
            }
        }

        System.out.println("请输入学生姓名：");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生家庭住址：");
        String address = sc.next();
        s.setAddress(address);

        list.add(s);
        System.out.println("学生信息添加成功"); //提示用户添加成功
    }

    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id:");
        String id = sc.next();
        if (contains(list,id) == true) {
            list.remove(getIndex(list,id));
            System.out.println("删除成功");
        } else {
            System.out.println("id不存在，删除失败");
        }
    }

    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生的id：");
        String id = sc.next();
        int index = getIndex(list,id);

        if (index >= 0) {
            System.out.println("请输入要修改的学生姓名：");
            String name = sc.next();
            list.get(index).setName(name);

            System.out.println("请输入要修改的学生年龄：");
            int age = sc.nextInt();
            list.get(index).setAge(age);

            System.out.println("请输入要修改的学生家庭住址：");
            String address = sc.next();
            list.get(index).setAddress(address);

            System.out.println("学生信息修改成功");
        } else {
            System.out.println("id不存在，修改失败");
        }
    }

    public static void queryStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询");
            return; //结束方法
        }

        //打印表头信息
        System.out.println("id\t\t姓名\t年龄\t家庭住址"); //\t为制表符
        //打印学生信息
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getAddress());
        }
    }

    public static boolean contains(ArrayList<Student> list, String id) {
        /*
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                return true;
            }
        }
        return false;
        */

         return getIndex(list,id) >= 0;
    }

    public static int getIndex(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

}
