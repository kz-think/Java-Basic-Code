package Test;

import java.util.ArrayList;
import java.util.Scanner;

//添加用户并通过id查询信息
public class UserInfoTest {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<UserInfo> list = new ArrayList<>();

        //2. 询问想要添加几个用户
        Scanner sc = new Scanner(System.in);
        System.out.println("How many users you want to add?");
        int amount = sc.nextInt();

        //3.键盘录入用户信息并添加进集合
        for (int i = 0; i < amount; i++) {
            //键盘录入并储存为变量
            System.out.println("Please enter the id of user" + " " + (i + 1));
            String id = sc.next();
            System.out.println("Please enter the username of user" + " " + (i + 1));
            String username = sc.next();
            System.out.println("Please enter the password of user" + " " + (i + 1));
            String password = sc.next();

            //创建user对象
            UserInfo user = new UserInfo(id, username, password);

            //将user对象放入集合
            list.add(user);
        }


        //询问想查询的id
        System.out.println("Please enter the id you want to find:");
        String idStr = sc.next();

        //查询id并返回结果与信息
        if (checkUser(idStr, list) == true) {
            System.out.println("This id exist, here is the information of the user:");
            System.out.println("Username: " + list.get(indexID(idStr,list)).getUsername());
            System.out.println("Password: " + list.get(indexID(idStr,list)).getPassword());
        } else {
            System.out.println("Sorry, this id does not exist");
        }
    }

    //判断id是否存在
    public static boolean checkUser(String idStr, ArrayList<UserInfo> list) {
        for (int i = 0; i < list.size(); i++) {
            if (idStr.equals(list.get(i))) {
                return true;
            }
        }
        return false;
    }

    //获取查询的id的index
    public static int indexID(String idStr, ArrayList<UserInfo> list) {
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (idStr.equals(list.get(i))) {
                index = i;
            }
        }

        return index;
    }

}