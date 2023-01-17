package Students;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{id = " + id + ", name = " + name + ", age = " + age + "}";
    }

    //键盘录入添加新学生
    public void addStudent(Student student){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Please enter the id of the new student");
        student.setId(sc1.nextInt());
        System.out.println("Please enter the name of the new student");
        student.setName(sc2.nextLine());
        System.out.println("Please enter the age of the new student");
        student.setAge(sc1.nextInt());
    }
}


