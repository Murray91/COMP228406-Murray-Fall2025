package Lab3exercise1;

public class Health extends Insurance {

    public Health(String insuranceType) {
        super(insuranceType);
    }

    @Override
    public void setInsuranceCost(double enteredCost) {
        this.monthlyCost = enteredCost;  // direct assignment for Health
    }

    @Override
    public void displayInfo() {
        System.out.printf("Insurance Type: %s (Health)%nMonthly Cost: $%.2f%n",
                insuranceType, monthlyCost);
    }
}

