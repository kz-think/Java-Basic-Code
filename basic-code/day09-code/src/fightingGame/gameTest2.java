package fightingGame;

public class gameTest2 {
    public static void main(String[] args) {
        Role r1 = new Role("Joe", 100);
        Role r2 = new Role("Tom",100);

        while(true) { //当一方死亡时才会结束循环
            //r1 attack r2
            r1.attack(r2);
            if(r2.getBlood() == 0) {
                System.out.println(r2.getName()+" has died, game over!");
                break;
            }

            //r2 attack r1
            r2.attack(r1);
            if(r2.getBlood() == 0) {
                System.out.println(r1.getName()+" has died, game over!");
                break;
            }
        }
    }
}
