import java.util.*;

public class TransactionVerificator {
    private static final int SEED = 42069;

    private Random random;
    private List<Integer> delays;
    
    public TransactionVerificator() {
        random = new Random(SEED);
        delays = new ArrayList<>();
        for (int i = 30; i <= 630; i += 30) {
            delays.add(i);
        }
        Collections.shuffle(delays, random);
    }

    public boolean isFraud(int amount) {
        try {
            Thread.sleep(delays.get(amount % delays.size()));
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
        return false;
    }

    public boolean verifyWithdraw(int currentBalance, int amount) {
        return amount <= currentBalance;
    }

    public boolean verifyDeposit(int currentBalance, int amount) {
        return true;
    }
}
