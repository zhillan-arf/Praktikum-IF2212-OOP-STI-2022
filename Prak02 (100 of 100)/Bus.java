/**
 * Bus.java
 * Membuat Bus
 * @author 18220008 Zhillan Attarizal Rezyarifin
 */

public class Bus extends Car {

    private int maxCapacity;

    // Konstruktor
    public Bus(int maxCapacity) {
        super(6);
        this.maxCapacity = maxCapacity;
    }

    // Get method
    public int getMaxCapacity() {
        return maxCapacity;
    }

    // Override toString
    public String toString() {
        String str = "Number of Wheels: " + String.valueOf(this.getNumberOfWheels()) 
        + ", Mileage: " + String.valueOf(this.getMileage()) 
        + ", Max Capacity: " + String.valueOf(this.getMaxCapacity());
        return str;
    }

    // Abstract impl get price
    public long getPrice() {
        if (0 <= this.getMileage() && this.getMileage() <= 10000) {
            return 1000000 * this.getMaxCapacity();
        }
        else {
            return 500000 * this.getMaxCapacity();
        }
    }
}
