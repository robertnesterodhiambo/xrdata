public class HourlyEmployee extends Employee {
    private double wage; // wage per hour
    private double hours; // hours worked for the week

    // Constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        if (wage < 0.0) { // validate
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        if ((hours < 0.0) || (hours > 168.0)) { // validate
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }
        this.wage = wage;
        this.hours = hours;
    }

    // Getters and setters
    public double getWage() { return wage; }
    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }
        this.wage = wage;
    }

    public double getHours() { return hours; }
    public void setHours(double hours) {
        if ((hours < 0.0) || (hours > 168.0)) {
            throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
        }
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount() {
        return (getHours() <= 40) ? getWage() * getHours() : (40 * getWage() + (getHours() - 40) * getWage() * 1.5);
    }

    @Override
    public String toString() {
        return String.format("Hourly employee: %s%nHourly wage: %.2f; Hours worked: %.2f",
                super.toString(), getWage(), getHours());
    }
}
