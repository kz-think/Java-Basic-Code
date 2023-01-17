package Goods;

public class Goods {
    private String id;
    private String name;
    private double price;
    private int inventory;

    public Goods() {
    }

    public Goods(String id, String name, double price, int inventory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String toString() {
        return "Goods{id = " + id + ", name = " + name + ", price = " + price + ", inventory = " + inventory + "}";
    }

    
}
