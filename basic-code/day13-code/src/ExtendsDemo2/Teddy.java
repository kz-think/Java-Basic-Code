package ExtendsDemo2;

public class Teddy extends Dog{

    public void cuddle(){
        System.out.println("cuddle");
    }

    @Override
    public void eat() { //方法的重写
        System.out.println("吃饭，啃骨头");
    }
}
