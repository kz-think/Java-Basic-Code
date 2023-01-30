package ExtendsDemo4;

public class Student {
    String name;
    int age;
    String school;

    //需求：默认大学为传智大学
    public Student() {
        //当调用空参构造时，通过this调用本类中的有参构造，给默认学校赋值
        //细节：虚拟机不会再添加 super();
        this(null,0,"传智大学");
    }

    public Student(String name, int age, String school) {
        //super();
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
