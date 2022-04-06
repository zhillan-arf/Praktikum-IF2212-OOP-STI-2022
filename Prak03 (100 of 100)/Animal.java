// 18220008 Zhillan Attarizal Rezyarifin
// Soal 1

public abstract class Animal implements HavePower {
    private int rawPower;
    private String habitat;

    public Animal (int rawPower, String habitat) {
        this.rawPower = rawPower;
        this.habitat = habitat;
    }

    public String getHabitat() {
        return this.habitat;
    }
    public int getRawPower() {
        return this.rawPower;
    }
    public boolean isStrongerThan(HavePower havepower) {
        return this.rawPower > havepower.getRawPower();
    }
    public void fight (Animal animal) {
        if ((this.getRawPower() > animal.getRawPower()) && (this.getHabitat() == animal.getHabitat())) {
            this.rawPower = this.rawPower + animal.getRawPower();
        }
    }
    public abstract void speak();
}
