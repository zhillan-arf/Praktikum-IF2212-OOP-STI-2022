/**
 * Main.java
 * Me-run program
 * @author 18220008 Zhillan Attarizal Rezyarifin
 */

import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int type = scanner.nextInt();
        if (type == 1) {
            int maxCapacity = scanner.nextInt();
            Bus bus = new Bus(maxCapacity);
            int dist = scanner.nextInt();
            System.out.println(bus.toString());
            System.out.println(bus.getPrice());
            bus.increaseMileage(dist);
            System.out.println(bus.toString());
            System.out.println(bus.getPrice());
        } else if (type == 2) {
            int numberOfWheels = scanner.nextInt();
            boolean loaded = scanner.nextBoolean();
            Truck truck = new Truck(numberOfWheels, loaded);
            int dist = scanner.nextInt();
            System.out.println(truck.toString());
            System.out.println(truck.getPrice());
            truck.increaseMileage(dist);
            System.out.println(truck.toString());
            System.out.println(truck.getPrice());
        } else {
            long basePrice = scanner.nextLong();
            Van van = new Van(basePrice);
            int dist = scanner.nextInt();
            System.out.println(van.toString());
            System.out.println(van.getPrice());
            van.increaseMileage(dist);
            System.out.println(van.toString());
            System.out.println(van.getPrice());
        }
    
        scanner.close();
    }
}