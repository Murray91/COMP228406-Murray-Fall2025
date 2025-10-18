package Lab3exercise1;

public abstract class Insurance {
    protected String insuranceType;
    protected double monthlyCost;

    public Insurance(String insuranceType) {
        this.insuranceType = insuranceType;
        this.monthlyCost = 0.0;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    // Abstract method that sets monthly cost using user-entered value
    public abstract void setInsuranceCost(double enteredCost);
    public abstract void displayInfo();
}
