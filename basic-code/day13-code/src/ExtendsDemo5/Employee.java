package ExtendsDemo5;

public class Employee {
    private String id;
    private String name;
    private double wage;

    public  Employee() {}
    public Employee(String id, String name, double wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
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

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String toString() {
        return
                "id='" + id + '\'' +
                        ", name='" + name + '\'' +
                        ", wage=" + wage;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void work() {
        System.out.println(name + " is working");
    }
}
