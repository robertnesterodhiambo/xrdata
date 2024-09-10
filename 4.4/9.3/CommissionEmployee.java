public class CommissionEmployee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage

    // Constructor
    public CommissionEmployee(String firstName, String lastName, String ssn, double sales, double rate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    // Setters and Getters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSocialSecurityNumber(String ssn) {
        this.socialSecurityNumber = ssn;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setGrossSales(double sales) {
        if (sales >= 0.0) {
            this.grossSales = sales;
        } else {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        if (rate > 0.0 && rate < 1.0) {
            this.commissionRate = rate;
        } else {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    // Calculate earnings
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("Commission Employee: %s %s%nSSN: %s%nGross Sales: %.2f%nCommission Rate: %.2f", 
                getFirstName(), getLastName(), getSocialSecurityNumber(), getGrossSales(), getCommissionRate());
    }
}
