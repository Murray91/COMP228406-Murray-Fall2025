package Lab3exercise3;

public class PersonalMortgage extends Mortgage {

    public PersonalMortgage(String mortgageNumber, String customerName,
                            double amount, double primeRate, int term) {
        super(mortgageNumber, customerName, amount, (primeRate / 100.0) + 0.02, term);
    }
}

