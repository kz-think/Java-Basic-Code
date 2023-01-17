package StringDemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //已知正确的用户名和密码
        String username = "kev";
        String password = "kz123456";

        //模拟登录
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your username:");
        String usernameInput = sc.next();
        System.out.println();

        System.out.println("Please enter your password:");
        String passwordInput = sc.next();
        System.out.println();

        if (usernameInput.equals(username) && passwordInput.equals(password)) {
            System.out.println("You have successfully logged in!");
        } else {
            int count = 0;
            System.out.println("The combination of username and password is wrong, please re-enter");

            for (int i = 0; i < 3; i++) {
                count++;
                System.out.println("Please enter your username:");
                usernameInput = sc.next();
                System.out.println();

                System.out.println("Please enter your password:");
                passwordInput = sc.next();
                System.out.println();

                if (usernameInput.equals(username) && passwordInput.equals(password)) {
                    System.out.println("You have successfully logged in!");
                    break;
                }

                if (count != 3) {
                    System.out.println("The combination of username and password is wrong, please re-enter");
                }

                if (count == 3) {
                    System.out.println();
                    System.out.println("You have reached the limited time of login!");
                }
            }
        }
    }
}






