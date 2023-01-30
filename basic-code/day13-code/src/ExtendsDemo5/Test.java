package ExtendsDemo5;

public class Test {
    public static void main(String[] args) {
        Manager m1 = new Manager("a01", "Kevin", 10000, 12000);
        Cook c1 = new Cook("c01", "Peter", 5000);
        System.out.println(m1.getName());
        System.out.println(c1.getName());
        System.out.println(m1.getBonus());
        m1.work();
        c1.eat();
        System.out.println(m1.toString());
        System.out.println(c1.toString());
    }

}
