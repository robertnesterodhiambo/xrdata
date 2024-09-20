import java.util.Scanner; // Import the Scanner class for user input

public class Conversion {

    // Method to convert Fahrenheit to Celsius and return the result as an integer
    // Formula: Celsius = 5.0 / 9.0 * (Fahrenheit - 32)
    public static int fahrenheitToCelsius(double fahrenheit) {
        // Convert and round the result to the nearest integer
        return (int) Math.round(5.0 / 9.0 * (fahrenheit - 32));
    }

    // Method to convert Celsius to Fahrenheit and return the result as an integer
    // Formula: Fahrenheit = 9.0 / 5.0 * Celsius + 32
    public static int celsiusToFahrenheit(double celsius) {
        // Convert and round the result to the nearest integer
        return (int) Math.round(9.0 / 5.0 * celsius + 32);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner object for reading user input

        // Display the menu to the user
        System.out.println("Temperature Conversion");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        
        // Ask the user for their choice of conversion
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt(); // Read the user's choice (1 or 2)

        // Check if the user selected Fahrenheit to Celsius conversion
        if (choice == 1) {
            // Prompt the user to enter the temperature in Fahrenheit
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble(); // Read the temperature in Fahrenheit

            // Convert Fahrenheit to Celsius using the fahrenheitToCelsius method
            int celsius = fahrenheitToCelsius(fahrenheit);

            // Display the converted temperature in Celsius (integer)
            System.out.printf("Temperature in Celsius: %d%n", celsius);
        
        // Check if the user selected Celsius to Fahrenheit conversion
        } else if (choice == 2) {
            // Prompt the user to enter the temperature in Celsius
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble(); // Read the temperature in Celsius

            // Convert Celsius to Fahrenheit using the celsiusToFahrenheit method
            int fahrenheit = celsiusToFahrenheit(celsius);

            // Display the converted temperature in Fahrenheit (integer)
            System.out.printf("Temperature in Fahrenheit: %d%n", fahrenheit);
        
        // Handle invalid input if the user enters a choice other than 1 or 2
        } else {
            System.out.println("Invalid choice.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
