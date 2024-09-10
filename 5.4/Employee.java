public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    // Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }

    @Override
    public String toString() {
        return String.format("%s %s\nSocial Security Number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    // Abstract method must be implemented by concrete subclasses
    @Override
    public abstract double getPaymentAmount();
}
