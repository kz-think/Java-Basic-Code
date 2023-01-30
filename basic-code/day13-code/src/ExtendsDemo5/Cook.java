package ExtendsDemo5;

public class Cook extends Employee{
    public Cook() {
    }

    public Cook(String id, String name, double wage) {
        super(id, name, wage);
    }

    @Override
    public void work() {
        System.out.println(getName() + "is cooking");
    }

    @Override
    public String toString() {
        return "Cook{" + super.toString() + '}';
    }
}
