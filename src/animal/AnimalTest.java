package animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal eagle = new Bird("Kiwi", 0.85, 4.5, true, 2.3, true);
        Animal lion = new LandAnimal("Tiger", 2, 190, true, 4);
        Animal clownfish = new Fish("Shark", 0.1, 0.3, false, 6, false);

        eagle.displayInfo();
        lion.displayInfo();
        clownfish.displayInfo();
    }
}
