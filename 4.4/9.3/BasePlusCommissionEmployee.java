public class BasePlusCommissionEmployee {
    private CommissionEmployee commissionEmployee;
    private double baseSalary; // base salary per week

    // Constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate, double salary) {
        commissionEmployee = new CommissionEmployee(firstName, lastName, ssn, sales, rate);
        setBaseSalary(salary);
    }

    // Set and Get methods for baseSalary
    public void setBaseSalary(double salary) {
        if (salary >= 0.0) {
            this.baseSalary = salary;
        } else {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Calculate earnings
    public double earnings() {
        return getBaseSalary() + commissionEmployee.earnings();
    }

    @Override
    public String toString() {
        return String.format("%s %s%nBase Salary: %.2f", commissionEmployee.toString(), "Base Plus Commission Employee", getBaseSalary());
    }
}
