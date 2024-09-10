public class BasePlusCommissionEmployeeTest {
    public static void main(String[] args) {
        // Create BasePlusCommissionEmployee object
        BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee(
            "John", "Doe", "123-45-6789", 5000, 0.04, 300);

        // Display employee information
        System.out.println(employee);

        // Calculate and display earnings
        System.out.printf("Earnings: %.2f%n", employee.earnings());
    }
}
