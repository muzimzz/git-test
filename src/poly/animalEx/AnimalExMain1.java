package poly.animalEx;

public class AnimalExMain1 {
    public static void main(String[] args) {
        Dog dog  = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
        soundAnimal(bird);
        soundAnimal(chicken);

        // flyAnimal(dog);
        // flyAnimal(cat);
        // flyAnimal(cow);
        flyAnimal(bird);
        flyAnimal(chicken);


    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void flyAnimal(Fly fly) {
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }

}
