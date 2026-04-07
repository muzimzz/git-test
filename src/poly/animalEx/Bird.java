package poly.animalEx;

public class Bird extends AbstractAnimal implements Fly{

    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
