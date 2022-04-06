public class DebitCard {
    private int balance;
    private TransactionVerificator transactionVerificator;
    private TransactionHistory transactionHistory;

    public DebitCard(int balance) {
        this.balance = balance;
        transactionVerificator = new TransactionVerificator();
        transactionHistory = new TransactionHistory();
    }

    public void withdraw(int amount) {
        if (!transactionVerificator.isFraud(amount)) {
            if (transactionVerificator.verifyWithdraw(balance, amount)) {
                synchronized(this) {
                    balance -= amount;
                    transactionHistory.addWithdraw(amount, true);
                }
                
            } else {
                transactionHistory.addWithdraw(amount, false);
            }
        }
    }

    public void deposit(int amount) {
        if (!transactionVerificator.isFraud(amount)) {
            if (transactionVerificator.verifyDeposit(balance, amount)) {
                synchronized(this) {
                    balance += amount;
                    transactionHistory.addDeposit(amount, true);
                }
            } else {
                transactionHistory.addDeposit(amount, false);
            }
        }
    }

    public void printTransactionsHistory() {
        transactionHistory.printTransactionsHistory();
        System.out.printf("\nCurrent Balance: %d\n", balance);
    }
}