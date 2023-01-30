package ExtendsDemo3;

//this: 理解为一个变量，表示当前方法调用者的地址值
//super: 代表父类的存储空间
public class Test {
    public static void main(String[] args) {
        Student s = new Student("Kevin",22);
        System.out.println(s.name + " " + s.age); //Kevin 22
    }


}
