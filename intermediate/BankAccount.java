/**
 * 14 - BankAccount
 * A tiny bank account: deposit, withdraw (no overdraft), balance enquiry.
 * Shows encapsulation: balance can only change via methods.
 *
 * Concepts: private fields, validation in methods, boolean returns.
 *
 * Run:
 *   javac BankAccount.java
 *   java BankAccount
 *
 * Sample output:
 *   Deposited 1000.0, balance = 1000.0
 *   Withdrew 300.0, balance = 700.0
 *   Withdrawal of 800.0 failed: insufficient funds.
 *   Final balance = 700.0
 */
public class BankAccount {
    private final String accountNo;
    private final String holder;
    private double balance;

    public BankAccount(String accountNo, String holder, double openingBalance) {
        this.accountNo = accountNo;
        this.holder = holder;
        this.balance = Math.max(0, openingBalance);
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be positive.");
            return false;
        }
        balance += amount;
        System.out.println("Deposited " + amount + ", balance = " + balance);
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal must be positive.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Withdrawal of " + amount + " failed: insufficient funds.");
            return false;
        }
        balance -= amount;
        System.out.println("Withdrew " + amount + ", balance = " + balance);
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("SB-001", "Shyam", 0);
        acc.deposit(1000);
        acc.withdraw(300);
        acc.withdraw(800); // should fail
        System.out.println("Final balance = " + acc.getBalance());
    }
}
