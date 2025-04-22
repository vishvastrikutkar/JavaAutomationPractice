package BDDSample;

public class Account {

    private double balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void debit(double amount) throws IllegalArgumentException {
        if (amount <= balance) balance -= amount;
        else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }
}
