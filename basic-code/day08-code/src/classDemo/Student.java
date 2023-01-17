package classDemo;

public class Student {
    private String name;
    private int age;

    //如果没有写任何构造方法，虚拟机会自动加上一个空参构造方法
    //空参构造方法：
    public Student(){
        System.out.println("看看我执行了吗");
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    //有参构造方法：
    //写了有参构造不写无参构造的话系统就不会自动创建无参构造
    public Student(String name, int age){
        this.name = name;
        if(age > 0){
            this.age = age;
        }else {
            System.out.println("非法数据");
        }
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
