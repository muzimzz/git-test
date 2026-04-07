package extends_overriding.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(1, 2);
        System.out.println("ClassC 생성자");
    }
}
