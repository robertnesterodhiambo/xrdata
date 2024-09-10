public class PayableInterfaceTest {
    public static void main(String[] args) {
        // Create an array of Payable objects
        Payable[] payableObjects = new Payable[6];
        
        // Populate the array with two Invoice objects and four Employee objects
        payableObjects[0] = new Invoice("01234", "Seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "Tire", 4, 79.95);
        payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        payableObjects[3] = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        payableObjects[4] = new CommissionEmployee("Sue", "Jones", "333-33-3333", 10000, .06);
       // payableObjects[5] = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

        // Process each element in the array polymorphically
        for (Payable currentPayable : payableObjects) {
            System.out.printf("%n%s %n%s: $%,.2f%n", 
                currentPayable.toString(), 
                "Payment due", currentPayable.getPaymentAmount());

            // If the object is a BasePlusCommissionEmployee, increase its base salary by 10%
            if (currentPayable instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentPayable;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Updated base salary with 10%% increase: $%,.2f%n", employee.getBaseSalary());
            }
        }
    }
}
