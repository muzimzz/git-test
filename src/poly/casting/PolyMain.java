package poly.casting;

public class PolyMain {

    public static void main(String[] args) {

        // 부모 변수가 부모 인스턴스 참조
        System.out.println("parent -> parent");
        Parent p = new Parent();
        p.parentMethod();

        // 자식 변수가 자식 인스턴스 참조
        System.out.println("child -> child");
        Child c = new Child();
        c.parentMethod();
        c.childMethod();

        // 부모 변수가 자식 인스턴스 참조
        System.out.println("parent -> child");
        Parent poly = new Child();
        poly.parentMethod();
        // poly.childMethod();

        // 자식 변수가 부모 인스턴스 참조(x)
        // Child poly = new Parent();
    }
}
