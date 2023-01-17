package Students;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        //创建数组并添加学生
        Student[] arr = new Student[3];

        Student s1 = new Student(1, "Tom", 23);
        Student s2 = new Student(2, "Peter", 21);
        Student s3 = new Student(3, "Wendy", 25);

        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        //遍历现有学生信息
        System.out.println("Information of the existing students:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

        //再次添加一个学生对象，
        Student s4 = new Student();
        s4.addStudent(s4);

        //对学号唯一性进行判断
        while(contains(s4.getId(), arr)) {
            System.out.println();
            System.out.println("There is repeat id in existing student, Please re-enter the information");
            s4.addStudent(s4);
            if(contains(s4.getId(),arr) == false){
                break;
            }
        }

        //将学生信息储存到数组中
        if(getCount(arr) == arr.length) { //数组已经存满
            Student[] newArr = createNewArr(arr);
            newArr[arr.length] = s4;
            printArr(newArr);
        } else { //数组已经存满
            arr[getCount(arr)] = s4;
            printArr(arr);
        }

        //通过id删除学生
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to delete a student by id? (0 for N / 1 for Y)");
        System.out.println();
        if(sc.nextInt() == 1){
            System.out.println("Please enter the id of the student you want to delete:");
            int idDelete = sc.nextInt();
            int indexDelete = getIndex(arr,idDelete);
            if(indexDelete >= 0){
                arr[indexDelete] = null;
            } else {
                System.out.println("This id does not exist!");
            }
        }

    }

    //method:

    //遍历所有学生信息
    public static void printArr(Student[] arr){
        System.out.println();
        System.out.println("Information of the students after add: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
    }

    //创建新数组
    public static Student[] createNewArr(Student[] arr){
        Student[] newArr = new Student[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    //查询新建学生的id是否和原有学生重合
    public static boolean contains(int id, Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                if(id == arr[i].getId()) {
                    return true;
                }
            }
        }

        return false;
    }

    //查询数组中存了几个学生
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null) {
                count++;
            }
        }

        return count;
    }

    //通过id获取index
    public static int getIndex(Student[] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                if(arr[i].getId() == id){
                    return i;
                }
            }
        }
        return -1;
    }
}

