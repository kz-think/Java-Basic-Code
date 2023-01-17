package classDemo;

public class GirlFriend2 {
    private int age; //0

    public void method(){
        int age = 10;
        System.out.println(age); //10, 就近原则，调取的上面的局部变量10
        System.out.println(this.age); //0，this方法，调用成员变量0
    }
}
