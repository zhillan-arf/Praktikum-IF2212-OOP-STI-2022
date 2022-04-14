// 18220008 Zhillan Attarizal Rezyarifin
// Prak 8 Soal 2 TreeSet

import java.util.*;

public class Main {
	public static void main(String arges[]) {
		// Scanner
		Scanner scanner1 = new Scanner(System.in);
		int Q = scanner1.nextInt();
		// Inisialisasi
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		for (int i = 0; i < Q; i++) {
			String inputStr = scanner1.next().toLowerCase();
			if (inputStr.equals("add")) {
				int inputInt = scanner1.nextInt();
				treeSet.add(inputInt);
			}
			else if (inputStr.equals("remove")) {
				int inputInt = scanner1.nextInt();
				if(!treeSet.remove(inputInt)) {
					System.out.printf("Element %d is not in The TreeSet\n", inputInt);}
			}
			else if (inputStr.equals("first")) {
				if (treeSet.isEmpty()) {
					System.out.println("EMPTY");}
				else {
					System.out.println(treeSet.first());}
			}
			else if (inputStr.equals("last")) {
				if (treeSet.isEmpty()) {
					System.out.println("EMPTY");}
				else {
					System.out.println(treeSet.last());}
			}
		}
	}
}
