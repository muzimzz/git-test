package extends_overriding.carEx;

public class ElectricCar extends Car{

    // Overloading: 이름이 같고 매개변수가 다른 메서드를 여러개 정의
    // Overriding: 상위 클래스의 메서드를 하위 클래스에서 재정의
    @Override
    public void moveCar() {
        System.out.println("전기자동차 움직임");
    }

    public void charge() {
        System.out.println("전기차 충전");
    }
}
