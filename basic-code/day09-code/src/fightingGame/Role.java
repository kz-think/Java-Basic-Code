package fightingGame;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String toString() {
        return "role{name = " + name + ", blood = " + blood + "}";
    }

    //定义一个方法用来攻击别人
    //思考谁攻击谁
    //

    public void attack(Role role) {
        //计算造成的伤害
        Random r = new Random();
        int damage = r.nextInt(1,21);

        //修改挨揍的人的血量
        int remainHealth = role.getBlood() - damage;
        remainHealth = remainHealth > 0 ? remainHealth : 0;

        role.setBlood(remainHealth);

        System.out.println(this.getName() + " has attacked " + role.getName() + ", " + damage + " damage has been caused, " + role.getName() + " has remaining health of "+ remainHealth);
    }

}
