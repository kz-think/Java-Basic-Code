package fightingGame02;


import java.util.Random;

public class gameTest {
    public static void main(String[] args) {
        //创建角色
        Role r1 = new Role("Shelby",100,'M');
        Role r2 = new Role("Lily",100,'F');

        //展示角色信息
        r1.showRoleInfo();
        System.out.println();
        r2.showRoleInfo();
        System.out.println();

        //开始格斗 回合制游戏
        Random r = new Random();
        int toss = r.nextInt(2);
        if(toss == 0){
            System.out.println(r1.getName()+" has won the toss, game started!");
            System.out.println();
            while(true) {
                //r1 attack r2
                r1.attack(r2);
                if(r2.getBlood() == 0) {
                    System.out.println();
                    System.out.println(r1.getName() + " has K.O " + r2.getName() + ", game over!");
                    break;
                }

                //r2 attack r1
                r2.attack(r1);
                if(r1.getBlood() == 0) {
                    System.out.println();
                    System.out.println(r2.getName() + " has K.O " + r1.getName() + ", game over!");
                    break;
                }
            }
        } else {
            System.out.println(r2.getName()+" has won the toss, game started!");
            System.out.println();
            while(true) {
                //r2 attack r1
                r2.attack(r1);
                if(r1.getBlood() == 0) {
                    System.out.println();
                    System.out.println(r2.getName() + " has K.O " + r1.getName() + ", game over!");
                    break;
                }

                //r1 attack r2
                r1.attack(r2);
                if(r2.getBlood() == 0) {
                    System.out.println();
                    System.out.println(r1.getName() + " has K.O " + r2.getName() + ", game over!");
                    break;
                }
            }
        }



    }
}
