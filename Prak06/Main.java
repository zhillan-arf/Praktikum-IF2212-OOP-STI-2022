//18220008 Zhillan Attarizal Rezyarifin
// Prak6 Main - implementasi car dan exception2nya

import java.lang.System;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Scanner
		Scanner scanner1 = new Scanner(System.in);
		// Inisialisasi
		String S = scanner1.next();
		Car car1 = new Car(S);
		boolean isSelesai = false;
		// Loop
		while (!(isSelesai)) {
			String operasi = scanner1.next();
			try {
				if (operasi.equals("Fill")) {
					car1.fillingFuel(scanner1.next(), scanner1.nextInt());
				}
				else if (operasi.equals("ChangeGear")) {
					car1.changeGear(scanner1.nextInt());
				}
				else if (operasi.equals("ChangeAcPower")) {
					car1.changeAcPower(scanner1.nextInt());
				}
				else if (operasi.equals("Start")) {
					car1.start();
				}
				else if (operasi.equals("Service")) {
					car1.service(scanner1.next(), scanner1.nextInt(), scanner1.nextInt(), scanner1.nextInt());
				}
				else if (operasi.equals("End")) {
					System.out.printf("Program selesai\n");
					isSelesai = true;
					scanner1.close();
					System.out.printf("Tidak ada unhandled exception\n");
				}
				else {
					throw new java.lang.Exception("Masukan tidak valid");
				}
			}
			catch (FuelException e) {
				System.out.printf("[FuelException] %s\n", e.getMessage());
			}
			catch (InvalidInputCarException e) {
				System.out.printf("[InvalidInputCarException] %s\n", e.getMessage());
			}
			catch (TheCarIsOnException e) {
				System.out.printf("[TheCarIsOnException] %s\n", e.getMessage());
			}
			catch (Exception e) {
				System.out.printf("Program selesai\n");
				isSelesai = true;
				scanner1.close();
				System.out.println(e.getMessage());
			}
		}
	}
}
