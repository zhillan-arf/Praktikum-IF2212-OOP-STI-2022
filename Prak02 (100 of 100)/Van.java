/**
 * Van.java
 * Membuat Van
 * @author 18220008 Zhillan Attarizal Rezyarifin
 */


public class Van extends Car {
    
    private long basePrice;

    // Konstruktor
    public Van(long basePrice) {
        super(4);
        this.basePrice = basePrice;
    }

    // Abstract impl get price
    public long getPrice() {
        long price;
        if (0 <= this.getMileage() && this.getMileage() <= 1000) {
            price = basePrice;
        }
        else if (1000 < this.getMileage() && this.getMileage() <= 10000) {
            price = (long) java.lang.Math.floor(basePrice * 3/4);
        }
        else {
            price = (long) java.lang.Math.floor(basePrice * 1/2);
        }
        return price;
    }


}
