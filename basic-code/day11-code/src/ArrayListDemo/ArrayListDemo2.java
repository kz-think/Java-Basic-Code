package ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //遍历集合
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                System.out.print("[" + list.get(i) + ",");
            } else if (i != 0 && i != list.size()-1) {
                System.out.print(list.get(i) + ",");
            } else {
                System.out.print(list.get(i) + "]");
            }
        }
    }
}
