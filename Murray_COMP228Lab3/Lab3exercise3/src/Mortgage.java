package Lab3exercise3;

public abstract class Mortgage implements MortgageConstants {
    protected String mortgageNumber;
    protected String customerName;
    protected double amount;
    protected double interestRate;
    protected int term;

    public Mortgage(String mortgageNumber, String customerName,
                    double amount, double interestRate, int term) {
        this.mortgageNumber = mortgageNumber;
        this.customerName = customerName;

        if (amount > MAX_MORTGAGE) {
            System.out.printf("Amount %.2f exceeds max (%.2f). Setting to max.%n",
                    amount, MAX_MORTGAGE);
            this.amount = MAX_MORTGAGE;
        } else {
            this.amount = amount;
        }

        this.interestRate = interestRate;

        if (term == SHORT_TERM || term == MEDIUM_TERM || term == LONG_TERM) {
            this.term = term;
        } else {
            System.out.printf("Term %d not valid; defaulting to short-term (%d year).%n",
                    term, SHORT_TERM);
            this.term = SHORT_TERM;
        }
    }

    public void getMortgageInfo() {
        System.out.println("==========================================");
        System.out.printf("Bank: %s%n", BANK_NAME);
        System.out.printf("Mortgage Number: %s%n", mortgageNumber);
        System.out.printf("Customer Name: %s%n", customerName);
        System.out.printf("Mortgage Amount: $%.2f%n", amount);
        System.out.printf("Interest Rate: %.2f%%%n", interestRate * 100);
        System.out.printf("Term (years): %d%n", term);
        System.out.printf("Total owed (principal + interest): $%.2f%n", computeTotalOwed());
        System.out.println("==========================================");
    }

    public double computeTotalOwed() {
        // Simple interest formula
        return amount + (amount * interestRate * term);
    }
}
