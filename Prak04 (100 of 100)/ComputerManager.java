/**
 * ComputerManager.java
 * Mamanage komputer 
 * @author 18220008 Zhillan Attarizal Rezyarifin
 */

import java.util.ArrayList;
import java.util.List;

public class ComputerManager {
    private List<Computer> list = new ArrayList<Computer>();

    /**
     * Menambahkan komputer ke array
     * 
     * @param computer objek Computer
     */
    public void addComputer(Computer computer) {
        // Tambahkan komputer ke list
        list.add(computer);
    }

    /**
     * Menyalakan monitor semua komputer yang mempunyai monitor 
     * dengan metode turnOnMonitor
     */
    public void turnOnAllMonitors() {
        for (Computer computer : this.list) {
            if (computer instanceof Monitor) {
                ((Monitor) computer).turnOnMonitor();
            }
        }
    }

    /**
     * Mematikan monitor semua komputer yang mempunyai monitor 
     * dengan metode turnOffMonitor
     */
    public void turnOffAllMonitors() {
        for (Computer computer : this.list) {
            if (computer instanceof Monitor) {
                ((Monitor) computer).turnOffMonitor();
            }
        }
    }

    /**
     * Mencetak spesifikasi semua komputer
     * dengan metode printSpecification
     */
    public void printAllSpecifications() {
        for (Computer computer : this.list) {
            computer.printSpecification();
        }
    }

    /**
     * Memindahkan semua komputer yang portable
     * dengan metode move
     */
    public void moveAllPortableComputers() {
        for (Computer computer : this.list) {
            if (computer instanceof Portable) {
                ((Portable) computer).move();
            }
        }
        
    }

    /**
     * Menggunakan keyboard semua komputer yang memiliki keyboard
     * dengan metode useKeyboard
     */
    public void useAllKeyboards() {
        for (Computer computer : this.list) {
            if (computer instanceof Keyboard) {
                ((Keyboard) computer).useKeyboard();
            }
        }
    }

}
