package Lab3exercise3;

import java.util.Scanner;

public class ProcessMortgage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mortgage[] mortgages = new Mortgage[3];

        System.out.print("Enter current prime interest rate (e.g., 5 for 5%): ");
        double primeRate = 0.0;
        try {
            primeRate = Double.parseDouble(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid rate. Using 5% as default.");
            primeRate = 5.0;
        }

        for (int i = 0; i < mortgages.length; i++) {
            System.out.printf("%nEntering data for mortgage %d/%d%n", i + 1, mortgages.length);

            System.out.print("Enter mortgage number: ");
            String number = sc.nextLine().trim();

            System.out.print("Enter customer name: ");
            String name = sc.nextLine().trim();

            System.out.print("Enter mortgage amount: ");
            double amount = 0.0;
            try {
                amount = Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid amount; setting to 0.");
            }

            System.out.print("Enter term (1, 3, or 5 years): ");
            int term = 0;
            try {
                term = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid term; will default to short-term.");
            }

            System.out.print("Enter mortgage type (Business / Personal): ");
            String type = sc.nextLine().trim();

            Mortgage m;
            if (type.equalsIgnoreCase("Business")) {
                m = new BusinessMortgage(number, name, amount, primeRate, term);
            } else {
                m = new PersonalMortgage(number, name, amount, primeRate, term);
            }

            mortgages[i] = m;
        }

        System.out.println("\n=== All Mortgages Entered ===");
        for (Mortgage m : mortgages) {
            m.getMortgageInfo();
        }

        double grandTotal = 0.0;
        for (Mortgage m : mortgages) {
            grandTotal += m.computeTotalOwed();
        }

        System.out.printf("Grand total owed across all mortgages: $%.2f%n", grandTotal);

        sc.close();
    }
}

