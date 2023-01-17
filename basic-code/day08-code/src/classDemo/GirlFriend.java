package classDemo;

//带有private的成员变量的赋值与获取方法

//private是一个权限修饰符
//private可以修饰成员变量和成员方法
//被private修饰的成员只能在本类中才能访问
//针对private修饰的成员变量，如果需要被其它类使用，需要提供相应操作
//例如set和get方法，就要用public修饰使他可以在其他类中被访问和使用

public class GirlFriend {
    private int age;
    private String name;

    //set（赋值）
    public void setAge(int a) {
        if(a >= 18 && a <= 50) {
            age = a;
        } else {
            System.out.println("非法数据");
        }
    }

    public void setName(String name){
        this.name = name; //使用this方法，将局部变量赋值给成员变量
    }

    //get（获取）
    public int getAge() {
        return age;
    }

    public String getName(){
        return this.name; //return成员变量
    }


}
