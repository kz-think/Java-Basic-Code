package fightingGame02;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String appearance; //长相随机

    String[] maleAppearance = {"Handsome", "Ugly", "Normal"};
    String[] femaleAppearance = {"Beautiful", "Ugly", "Normal"};

    Random r = new Random();


    public Role() {
    }

    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setAppearance(gender);
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(char gender) {
        if(gender == 'M') {
            this.appearance = maleAppearance[r.nextInt(maleAppearance.length)];
        } else if (gender == 'F') {
            this.appearance = femaleAppearance[r.nextInt(femaleAppearance.length)];
        }
    }

    public void showRoleInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Health: "+getBlood());
        System.out.println("Gender: "+getGender());
        System.out.println("Appearance: "+getAppearance());
    }

    public String toString() {
        return "role{name = " + name + ", blood = " + blood + "}";
    }

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


