public class BasePlusCommissionEmployee implements Payable {
    private CommissionEmployee commissionEmployee; // composition
    private double baseSalary; // base salary per week

    // Constructor
    public BasePlusCommissionEmployee(CommissionEmployee commissionEmployee, double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.commissionEmployee = commissionEmployee;
        this.baseSalary = baseSalary;
    }

    // Getters and setters
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public CommissionEmployee getCommissionEmployee() { return commissionEmployee; }

    @Override
    public double getPaymentAmount() {
        return getBaseSalary() + commissionEmployee.getPaymentAmount();
    }

    @Override
    public String toString() {
        return String.format("Base-salaried commission employee: %s%nBase salary: %.2f",
                commissionEmployee.toString(), getBaseSalary());
    }
}
