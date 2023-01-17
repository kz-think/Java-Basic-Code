package Test;

import java.util.ArrayList;

//返回价格低于3000的手机的信息
public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> phone = new ArrayList<>();
        Phone p1 = new Phone("Mi",1000);
        Phone p2 = new Phone("Apple",8000);
        Phone p3 = new Phone("TT",2999);
        phone.add(p1);
        phone.add(p2);
        phone.add(p3);

        getInfo(phone);
    }

    public static void getInfo(ArrayList<Phone> phone){
        for (int i = 0; i < phone.size(); i++) {
            if (phone.get(i).getPrice() < 3000) {
                System.out.println("Brand: " + phone.get(i).getBrand());
                System.out.println("Price: " + phone.get(i).getPrice());
            }
        }
    }



}
