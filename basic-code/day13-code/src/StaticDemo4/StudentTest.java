package StaticDemo4;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "Mrs.Lisa";

        Student s1 = new Student();
        System.out.println("s1: "+ s1);
        s1.name = "Kev";
        s1.age = 22;
        s1.show1();

        System.out.println();

        Student s2 = new Student();
        System.out.println("s2: "+ s2);
        s2.name = "Peter";
        s2.age = 21;
        s2.show1();

    }
}
