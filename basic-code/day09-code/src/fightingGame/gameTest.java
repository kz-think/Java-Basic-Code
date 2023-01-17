package fightingGame;

import java.util.Random;

public class gameTest {
    public static void main(String[] args) {
        //创建角色
        Role r1 = new Role("Joe", 100);
        Role r2 = new Role("Tom",100);

        //开始格斗 回合制游戏
        Random r = new Random();
        int toss = r.nextInt(2);
        if(toss == 0){
            System.out.println(r1.getName()+" has won the toss, game started!");
            while(true) { //当一方死亡时才会结束循环
                //r1 attack r2
                r1.attack(r2);
                if(r2.getBlood() == 0) {
                    System.out.println(r2.getName()+" has died, game over!");
                    break;
                }

                //r2 attack r1
                r2.attack(r1);
                if(r1.getBlood() == 0) {
                    System.out.println(r1.getName()+" has died, game over!");
                    break;
                }
            }
        } else {
            System.out.println(r2.getName()+" has won the toss, game started!");
            while(true) {
                //r2 attack r1
                r2.attack(r1);
                if(r1.getBlood() == 0) {
                    System.out.println(r1.getName()+" has died, game over!");
                    break;
                }

                //r1 attack r2
                r1.attack(r2);
                if(r2.getBlood() == 0) {
                    System.out.println(r2.getName()+" has died, game over!");
                    break;
                }
            }
        }



    }
}
