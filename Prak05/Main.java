// 1822008 Zhillan Attarizal Rezyarifin
// Prak5 Main - Menguji HashMap

import java.util.Scanner;
import java.lang.System;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int Q = scanner1.nextInt();

        HashMap<String,Integer> hMap = new HashMap<String,Integer>();

        for (int i = 0; i < Q; i++) {
            String tipe = scanner1.next();
            if (tipe.equals("PUT")) {
                hMap.put(scanner1.next(), scanner1.nextInt());;
            } 
            else if (tipe.equals("GET")) {
                System.out.println(hMap.get(scanner1.next()));
            } 
            else if (tipe.equals("REMOVE")) {
                hMap.remove(scanner1.next());
            } 
            else if (tipe.equals("CLEAR")) {
                hMap.clear();
            }
        }
        scanner1.close();
    }
}