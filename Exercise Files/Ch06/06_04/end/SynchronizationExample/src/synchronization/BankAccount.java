
package synchronization;

/**
 * @author luis
 */
public class BankAccount {

    private final int overdraft;
    private int balance = 0;

    public BankAccount(int overdraft) {
        this.overdraft = overdraft;
    }

    void topUp(int amount) {
        balance += amount;
    }

    void debit(int amount) {
        balance -= amount;
    }

    int getBalance() {
        return balance;
    }

    int getOverdraft() {
        return overdraft;
    }


}
