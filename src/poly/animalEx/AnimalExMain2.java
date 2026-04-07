package poly.animalEx;

public class AnimalExMain2 {

    public static void main(String[] args) {

        // Animal duck = new Animal();
        // 추상 클래스 인스턴스 생성 불가
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        AbstractAnimal[] animalArr = {dog, cat, cow};

        for (AbstractAnimal animal : animalArr) {
            soundAnimal(animal);
        }


    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
