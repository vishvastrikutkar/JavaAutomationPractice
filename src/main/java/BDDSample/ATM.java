package BDDSample;

public class ATM {

    private final Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        if (account != null) account.debit(amount);
        else {
            throw new IllegalStateException("No account linked to the ATM");
        }
    }
}
