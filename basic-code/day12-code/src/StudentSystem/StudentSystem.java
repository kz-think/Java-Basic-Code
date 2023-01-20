package StudentSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        userInterface();
    }

    //用户界面
    public static void userInterface() {
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        loop: while (true) {
            System.out.println("--------欢迎来到学生管理系统登陆界面--------");
            System.out.println("请选择操作：1登录 2注册 3忘记密码 4退出");
            String choose = sc.next();

            switch (choose) {
                case "1" -> {
                    login(list);
                    break loop;
                }
                case "2" -> {
                    signIn(list);
                    System.out.println("正在返回主界面");
                    System.out.println();
                }
                case "3" -> {
                    forgetPassword(list);
                    System.out.println("正在返回主界面");
                    System.out.println();
                }
                case "4" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> {
                    System.out.println("没有这个选项");
                    System.out.println();
                }

            }
        }

    }

    public static void signIn(ArrayList<User> list) {
        String username;
        String password;
        String id;
        String phone;

        username = getUsername(list);
        password = getPassword();
        id = getId();
        phone = getPhone();

        User u = new User(username,password,id,phone);
        list.add(u);

        System.out.println("注册成功");
    }

    public static boolean login(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            int index = getIndex(list,username);
            int count = 0;
            if (index >= 0) {
                System.out.println("请输入密码：");
                String password = sc.next();
                if (captchaIsRight()) {
                    if (password.equals(list.get(index).getPassword())) {
                        System.out.println("登录成功");
                        startStudentSystem();
                        break;
                    } else {
                        if (count > 3) {
                            System.out.println("密码错误超过3次，登陆失败");
                            return false;
                        }
                        System.out.println("密码与用户名不匹配，请重新登录：");
                        count++;
                    }
                }
            } else {
                System.out.println("用户名不存在，请重新输入：");
            }
        }
        return true;
    }

    public static void forgetPassword(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.next();
        if (getIndex(list, username) >= 0) {
            int index = getIndex(list,username);
            System.out.println("请输入身份证：");
            String id = sc.next();
            System.out.println("请输入手机号：");
            String phone = sc.next();
            if (id.equals(list.get(index).getId()) && phone.equals(list.get(index).getPhone())) {
                String password = getPassword();
                list.get(index).setPassword(password);
                System.out.println("密码修改成功");
            } else {
                System.out.println("账号信息不匹配，修改失败");
            }
        } else {
            System.out.println("用户名不存在，未注册");
        }
    }

    public static int getIndex(ArrayList<User> list, String username) {
        for (int i = 0; i < list.size(); i++) {
            if (username.equals(list.get(i).getUsername())) {
                return i;
            }
        }

        return -1;
    }

    public static boolean checkFormat(String username) {
        char c;
        boolean check;
        int photicCount = 0;
        int numCount = 0;
        for (int i = 0; i < username.length(); i++) {
            c = username.charAt(i);
            check = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z' || (c >= '0' && c <= '9'));
            if (check) {
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                    photicCount++;
                } else if ((c >= '0' && c <= '9')) {
                    numCount++;
                }
            } else {
                return false;
            }
        }

        //check if all photic or num
        if (photicCount == username.length() || numCount == username.length()) {
            return  false;
        }

        //check length
        boolean checkLength = (username.length() >= 3 && username.length() <= 15);
        if (!checkLength) {
            return false;
        }

        return true;
    }

    public static String getUsername(ArrayList<User> list) {
        Scanner sc = new Scanner(System.in);
        String username;
        while (true) {
            System.out.println("请输入用户名：");
            username = sc.next();
            if (getIndex(list, username) != -1) {
                System.out.println("用户名已存在，请重新输入：");
            } else {
                if (checkFormat(username) == false) {
                    System.out.println("用户名格式错误，请重新输入：");
                } else {
                    break;
                }
            }
        }
        return username;
    }

    public static String getPassword() {
        Scanner sc = new Scanner(System.in);
        String p1;
        String p2;
        while (true) {
            System.out.println("请输入密码：");
            p1 = sc.next();
            System.out.println("请确认密码：");
            p2 = sc.next();
            if (p1.equals(p2)) {
                break;
            }
            System.out.println("密码不一致,输入失败,请重新输入");
        }
        return p1;
    }

    public static String getId() {
        Scanner sc = new Scanner(System.in);
        String id;

        while (true) {
            System.out.println("请输入身份证：");
            id = sc.next();
            boolean flag = true;
            if (id.length() == 18) {
                if (id.charAt(0) != '0') {
                    forLoop: for (int i = 0; i < 17; i++) {
                        flag = (id.charAt(i) >= '0' && id.charAt(i) <= '9');
                    }
                    if (flag) {
                        if ((id.charAt(17) >= '0' && id.charAt(17) <= '9') || (id.charAt(17) == 'X' || id.charAt(17) == 'x')) {
                            break;
                        }
                    }
                }
            }
            System.out.println("身份证验证失败，请重新输入");
        }

        return id;
    }

    public static String getPhone() {
        Scanner sc = new Scanner(System.in);
        String phone;
        boolean isNum = true;

        while (true) {
            System.out.println("请输入手机号：");
            phone = sc.next();
            if (phone.length() == 11) {
                if (phone.charAt(0) != '0') {
                    for (int i = 0; i < phone.length(); i++) {
                        isNum = phone.charAt(i) >= '0' && phone.charAt(i) <= '9';
                    }
                    if (isNum) {
                        break;
                    }
                }
            }
            System.out.println("手机号格式错误，请重新输入");
        }
        return phone;
    }

    public static boolean captchaIsRight() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        while (true) {
            StringBuilder captcha = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                captcha.append(str.charAt(r.nextInt(str.length())));
            }
            System.out.println("请输入验证码：" + captcha);
            String input = sc.next();
            if (input.equals(captcha.toString())) {
                return true;
            }
            System.out.println("验证码错误，请重新输入：");
        }
    }

    //学生管理系统
    public static void startStudentSystem() {
        //学生信息Arraylist
        ArrayList<Student> list = new ArrayList<>();

        loop: while (true) {
            //主界面
            System.out.println();
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
            list.remove(getIndexStudent(list,id));
            System.out.println("删除成功");
        } else {
            System.out.println("id不存在，删除失败");
        }
    }

    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生的id：");
        String id = sc.next();
        int index = getIndexStudent(list,id);

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

        return getIndexStudent(list,id) >= 0;
    }

    public static int getIndexStudent(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }
}
