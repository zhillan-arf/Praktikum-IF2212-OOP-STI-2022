import java.util.*;

public class TransactionHistory {
    private List<History> transactionsHistory;

    public static enum Transaction {
        WITHDRAW,
        DEPOSIT
    }

    public static class History {
        private Transaction transactionType;
        private int amount;
        private boolean success;

        public History(Transaction transactionType, int amount, boolean success) {
            this.transactionType = transactionType;
            this.amount = amount;
            this.success = success;
        }

        public String toString() {
            return String.format("%s, %d, %b", transactionType.toString(), amount, success);
        }
    }

    public TransactionHistory() {
        transactionsHistory = Collections.synchronizedList(new ArrayList<>());
    }

    public void addWithdraw(int amount, boolean success) {
        transactionsHistory.add(new History(Transaction.WITHDRAW, amount, success));
    }

    public void addDeposit(int amount, boolean success) {
        transactionsHistory.add(new History(Transaction.DEPOSIT, amount, success));
    }

    public void printTransactionsHistory() {
        System.out.println("[ Transactions History ]");
        System.out.println("transactionType, amount, success");
        for (History history : transactionsHistory) {
            System.out.println(history);
        }
    }
}
