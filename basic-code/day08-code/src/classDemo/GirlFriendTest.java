package classDemo;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend();
        gf.setAge(18);
        System.out.println(gf.getAge()); //18
        gf.setName("Alice");
        System.out.println(gf.getName()); //Alice

        GirlFriend gf2 = new GirlFriend();
        gf2.setAge(16); //非法数据
        System.out.println(gf2.getAge()); //0
    }
}
