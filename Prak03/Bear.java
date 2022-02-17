// 18220008 Zhillan Attarizal Rezyarifin
// Soal 2

public class Bear extends Animal implements Carnivore, Herbivore {
    // Konstruktor
    public Bear() {
        super(125, "MOUNTAIN");
    }
    public Bear(int rawPower) {
        super(rawPower, "MOUNTAIN");
    }

    // Abstract method
    public void speak() {
        System.out.println("I'm a Good Bear.");
    }

    // Implements Carnivore
    public void eatMeat() {
        System.out.println("I'm eating a meat.");
    }
    public void hunt(Animal animal) {
        if (this.getRawPower() > animal.getRawPower()) {
            this.eatMeat();
        }
    }

    // Implements Herbivore
    public void eatPlant() {
        System.out.println("I'm eating a plant.");
    }
}
