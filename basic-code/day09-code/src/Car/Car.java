package Car;

import java.util.Scanner;

public class Car {
    String brand;
    Double price;
    String color;


    public Car() {
    }

    public Car(String brand, Double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Car{brand = " + brand + ", price = " + price + ", color = " + color + "}";
    }

    public void defineCar(Car car){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Please enter the brand of the vehicle");
        car.setBrand(sc1.nextLine());
        System.out.println("Please enter the price of the vehicle");
        car.setPrice(sc2.nextDouble());
        System.out.println("Please enter the color of the vehicle 1");
        car.setColor(sc1.nextLine());



    }

}
