import java.util.Scanner; // Import the Scanner class for input

public class arithmetic {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt(); // Read the first integer

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt(); // Read the second integer

        // Perform arithmetic operations
        int sum = number1 + number2;
        int product = number1 * number2;
        int difference = number1 - number2;
        int quotient = number1 / number2; // Integer division

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);
    }
}
