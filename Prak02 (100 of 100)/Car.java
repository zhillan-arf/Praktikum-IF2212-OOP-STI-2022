/**
 * Car.java
 * Membuat Car
 * @author 18220008 Zhillan Attarizal Rezyarifin
 */

public abstract class Car {
    private int numberOfWheels;
    private long mileage;
    
    public Car(int numberOfWheels) {
        // Konstruktor, set mileage = 0
        this.numberOfWheels = numberOfWheels;
        this.mileage = 0;
    }
    
    public int getNumberOfWheels() {
        // Mengembalikan atribut numberOfWheels
        return numberOfWheels;
    }
  
    public long getMileage() {
        // Mengembalikan atribut mileage
        return mileage;
    }
    
    public void increaseMileage(long increment) {
        // Meningkatkan nilai atribut mileage
        this.mileage = (mileage + increment);
    }
  
    public String toString() {
        // Mengembalikan informasi mobil dengan format: "Number of Wheels: {numberOfWheels}, Mileage: {mileage}"
        String str = "Number of Wheels: " + String.valueOf(this.getNumberOfWheels()) + ", Mileage: " + String.valueOf(this.getMileage());
        return str;
    }
  
    public abstract long getPrice();
}
  