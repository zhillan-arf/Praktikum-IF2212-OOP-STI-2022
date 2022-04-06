import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner1 = new Scanner(System.in);
        int balance = scanner1.nextInt();
        int Q = scanner1.nextInt();
        // Inisialisasi
        DebitCard debitCard1 = new DebitCard(balance);
        Thread[] threads = new Thread[Q];
        // Pengisian
        for (int i = 0; i < Q; i++) {
            String inputStr = scanner1.next();
            if (inputStr.equals("W")) {
                int input = scanner1.nextInt();
                threads[i] = new Thread() {
                    @Override
                    public void run() {
                        debitCard1.withdraw(input);
                    }
                };
            }
            else if (inputStr.equals("D")) {
                int input = scanner1.nextInt();
                threads [i] = new Thread() {
                    @Override
                    public void run() {
                        debitCard1.deposit(input);
                    }
                };
            }
        }
        // All transactions are stored in threads
        // Start all transactions
        for (int i = 0; i < Q; i++) {
            threads[i].start();
        }
        // Unorthodox waiting
        boolean isNotFinished = true;
        while (isNotFinished) {
            for (int i = 0; i < Q; i++) {
                isNotFinished = threads[i].isAlive();
            }
        }
        // All transactions are finished
        debitCard1.printTransactionsHistory();
        scanner1.close();
    }
}
