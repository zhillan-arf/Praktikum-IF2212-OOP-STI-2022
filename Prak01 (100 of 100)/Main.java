/**
 * Main.java
 * Memasukkan data FAANG dan mengeluarkan apakah dia dapat dipromosikan 
 * dan salary bonus atau berapa banyak poin yang dibutuhkan untuk naik gaji
 * @author 18220008 Zhillan Attarizal Rezyarifin
 */
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // INPUT
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double baseSalary = scanner.nextDouble();
        double currentPoints = scanner.nextDouble();
        double targetPoints = scanner.nextDouble();

        scanner.close();

        // PROCESS
        Employee FAANG = new Employee(name, baseSalary);
        EmployeePerformance FAANGPerformance = new EmployeePerformance(FAANG, currentPoints, targetPoints);
        boolean isPromotable = FAANGPerformance.isPromotable();

        // OUTPUT
        if (isPromotable) {
            System.out.println("YES");
            System.out.printf("%.2f\n", FAANGPerformance.getCurrentSalary());
        }
        else {
            System.out.println("NO");
            System.out.printf("%.2f\n", (2 * targetPoints) - currentPoints);
        }
    }
}