/**
 * Employee.java
 * Mendat dan mengatur nama, gaji, dan jumlah karyawan
 * @author 18220008 Zhillan Attarizal Rezyarifin
 */

public class Employee {

    private static int employeeCount;

    private String name;
    private double baseSalary;

    /**
     * Konstruktor
     * @param name
     * @param baseSalary
     */
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        employeeCount++;
    }

    /**
     * Menambahkan gaji pegawai
     * @param amount jumlah peningkatan, asumsi amount >= 0
     */
    public void increaseSalary(double amount) {
        this.baseSalary = baseSalary + amount;
    }

    /**
     * Getter name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter baseSalary
     * @return baseSalary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * @return jumlah karyawan
     */
    public static int getEmployeeCount() {
        return employeeCount;
    }
}