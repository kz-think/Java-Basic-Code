package ExtendsDemo5;

public class Manager extends Employee{
    private double bonus;

    public Manager() {}

    public Manager(String id, String name, double wage, double bonus) {
        super(id, name, wage);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString() + ", " +
                "bonus=" + bonus +
                '}';
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing");
    }
}




