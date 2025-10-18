package Lab3exercise1;

public class Life extends Insurance {

    public Life(String insuranceType) {
        super(insuranceType);
    }

    @Override
    public void setInsuranceCost(double enteredCost) {
        this.monthlyCost = enteredCost * 1.02;  // 2% extra for Life
    }

    @Override
    public void displayInfo() {
        System.out.printf("Insurance Type: %s (Life)%nMonthly Cost: $%.2f%n",
                insuranceType, monthlyCost);
    }
}

