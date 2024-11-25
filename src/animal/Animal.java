package animal;

/**
 * Design and develop the following program:
 * The program describes animals.
 * Animals can be birds, land, fish animals
 * Design and develop a program that describes the animals using their common features (like typical size, typical weight, predator or vegetarian and some other features) and features specific for fish, birds, and land animals only (like species name, number of legs, wingspan, number of fins, etc.).
 * Classes “Bird”, “LandAnimal”, and “Fish” are derived from class “Animals”
 * */
// Base class for Animals
class Animal {
    private String speciesName;
    private double size, weight;
    private boolean isPredator;

    public Animal(String speciesName, double size, double weight, boolean isPredator) {
        this.speciesName = speciesName;
        this.size = size;
        this.weight = weight;
        this.isPredator = isPredator;
    }

    public void displayInfo() {
        System.out.println("Species: " + speciesName + ", Size: " + size + "m, Weight: " + weight + "kg, Predator: " + isPredator);
    }
}

// Bird class
class Bird extends Animal {
    private double wingSpan;
    private boolean canFly;

    public Bird(String name, double size, double weight, boolean predator, double wingSpan, boolean canFly) {
        super(name, size, weight, predator);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wingspan: " + wingSpan + "m, Can Fly: " + canFly);
    }
}

// LandAnimal class
class LandAnimal extends Animal {
    private int legs;

    public LandAnimal(String name, double size, double weight, boolean predator, int legs) {
        super(name, size, weight, predator);
        this.legs = legs;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Legs: " + legs);
    }
}

// Fish class
class Fish extends Animal {
    private int fins;
    private boolean isSaltwater;

    public Fish(String name, double size, double weight, boolean predator, int fins, boolean isSaltwater) {
        super(name, size, weight, predator);
        this.fins = fins;
        this.isSaltwater = isSaltwater;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fins: " + fins + ", Saltwater: " + isSaltwater);
    }
}
