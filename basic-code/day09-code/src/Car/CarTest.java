package Car;

public class CarTest {
    public static void main(String[] args) {
        //创建数组
        Car[] arr = new Car[3];

        //输入商品信息
        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();
            System.out.println("Please enter the information of vehicle " + (i+1) + ":");
            c.defineCar(c);
            arr[i] = c;
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Car" + (i+1) + " : " + arr[i]);
        }

        //求平均价格
        double totalPrice = 0;
        for (int i = 0; i < arr.length; i++) {
            totalPrice += arr[i].getPrice();
        }
        double averagePrice = totalPrice/arr.length;
        System.out.println("Average price is: " + averagePrice);

        System.out.println();

        //统计比平均价格低的车有几辆，并打印这些车的信息
        int carBelowAvr = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getPrice() < averagePrice) {
                carBelowAvr ++;
                System.out.println("This car is below average price: " + arr[i]);
            }
        }
        System.out.println(carBelowAvr + " cars are below average price.");
    }
}



