public class Account {
    private double balance;

    // Constructor
    public Account(double initialBalance) {
        if (initialBalance > 0.0) {
            balance = initialBalance;
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Withdrawal amount exceeded account balance.");
        } else {
            balance -= amount;
        }
    }

    // Get balance method
    public double getBalance() {
        return balance;
    }
}
