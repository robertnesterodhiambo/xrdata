import java.util.Scanner; // Import the Scanner class for user input

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner object to read input from the user

        // Get the initial balance from the user
        System.out.print("Enter the initial balance: $");
        double initialBalance = scanner.nextDouble();

        // Create an account with the user-specified initial balance
        Account myAccount = new Account(initialBalance);

        // Display the initial balance
        System.out.printf("Initial balance: $%.2f%n", myAccount.getBalance());

        // Get the deposit amount from the user
        System.out.print("Enter the deposit amount: $");
        double depositAmount = scanner.nextDouble();

        // Deposit money into the account
        myAccount.deposit(depositAmount);
        System.out.printf("Balance after deposit: $%.2f%n", myAccount.getBalance());

        // Get the withdrawal amount from the user
        System.out.print("Enter the withdrawal amount: $");
        double withdrawAmount = scanner.nextDouble();

        // Try to withdraw the user-specified amount
        myAccount.withdraw(withdrawAmount);
        System.out.printf("Balance after withdrawal of $%.2f: $%.2f%n", withdrawAmount, myAccount.getBalance());

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
