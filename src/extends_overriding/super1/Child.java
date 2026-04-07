package extends_overriding.super1;

public class Child extends Parent{

    public String value = "Child";

    @Override
    public void hello() {
        System.out.println(value + ".hello");
    }

    public void call() {
        System.out.println("this value = " + this.value);
        System.out.println("super value = " + super.value);
    }
}
