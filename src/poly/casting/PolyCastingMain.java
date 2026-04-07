package poly.casting;

public class PolyCastingMain {

    public static void main(String[] args) {

        Parent poly = new Child();
        // poly.childMethod();
        System.out.println("parent -> child");

        // downCasting
        // Child child = poly;
        // Child child = (Child)poly; child.childMethod();

        // (child)poly.childMethod(); -> 연산자 우선순위 오류
        ((Child)poly).childMethod();

        // upcasting
        Child child = new Child();
        System.out.println("child -> parent");
        // Parent p = (Parent)child;
        Parent p = child;  // upcasting 생략 권장

        p.parentMethod();
    }
}
