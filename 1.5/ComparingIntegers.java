import java.util.Scanner; // Import the Scanner class for input

public class ComparingIntegers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt(); // Read the first integer

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt(); // Read the second integer

        // Compare the two integers
        if (number1 > number2) {
            System.out.println(number1 + " is larger.");
        } else if (number2 > number1) {
            System.out.println(number2 + " is larger.");
        } else {
            System.out.println("These numbers are equal.");
        }
    }
}

