/**
 * Truck.java
 * Membuat Truck
 * @author 18220008 Zhillan Attarizal Rezyarifin
 */

public class Truck extends Car {
    
    private boolean loaded;

    // Konstruktor
    public Truck(int numberOfWheels, boolean loaded) {
        super(numberOfWheels);
        this.loaded = loaded;
    }

    // Get method
    public boolean isLoaded() {
        return this.loaded;
    }

    // Turn loaded to true
    public void load() {
        this.loaded = true;
    }

    // Turn loaded to false
    public void unload() {
        this.loaded = false;
    }

    // Override toString
    public String toString() {
        String str = "Number of Wheels: " + String.valueOf(this.getNumberOfWheels()) 
        + ", Mileage: " + String.valueOf(this.getMileage()) 
        + ", Is Loaded: " + String.valueOf(this.isLoaded());
        return str;
    }
    
    // Abstract impl get price
    public long getPrice() {
        return 5000000 * this.getNumberOfWheels();
    }
}
