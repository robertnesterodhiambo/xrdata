public class CommissionEmployee extends Employee {
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // Constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        if (grossSales < 0.0) { // validate
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    // Getters and setters
    public double getGrossSales() { return grossSales; }
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() { return commissionRate; }
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPaymentAmount() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("Commission employee: %s%nGross sales: %.2f%nCommission rate: %.2f",
                super.toString(), getGrossSales(), getCommissionRate());
    }
}
