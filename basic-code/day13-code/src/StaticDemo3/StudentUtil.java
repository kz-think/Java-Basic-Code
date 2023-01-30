package StaticDemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){}

    public static int getMaxAge (ArrayList<Student> list) {
        int maxAge = 0;
        for (int i = 0; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            if (tempAge > maxAge) {
                maxAge = tempAge;
            }
        }
        return maxAge;
    }
}
