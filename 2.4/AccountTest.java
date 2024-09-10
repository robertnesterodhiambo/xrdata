public class AccountTest {
    public static void main(String[] args) {
        // Create an account with an initial balance
        Account myAccount = new Account(100.00);

        // Display initial balance
        System.out.printf("Initial balance: $%.2f%n", myAccount.getBalance());

        // Deposit money into the account
        myAccount.deposit(50.00);
        System.out.printf("Balance after deposit: $%.2f%n", myAccount.getBalance());

        // Try to withdraw an amount greater than the balance
        myAccount.withdraw(200.00);
        System.out.printf("Balance after attempting to withdraw $200.00: $%.2f%n", myAccount.getBalance());

        // Withdraw a valid amount
        myAccount.withdraw(70.00);
        System.out.printf("Balance after withdrawal of $70.00: $%.2f%n", myAccount.getBalance());
    }
}
