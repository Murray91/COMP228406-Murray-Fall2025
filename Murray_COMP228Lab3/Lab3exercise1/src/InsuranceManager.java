package Lab3exercise1;

import java.util.Scanner;

public class InsuranceManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX_POLICIES = 5;
        Insurance[] policies = new Insurance[MAX_POLICIES];
        int count = 0;

        System.out.println("=== Insurance Manager ===");

        boolean more = true;
        while (more && count < MAX_POLICIES) {
            System.out.print("Enter insurance type (Health / Life): ");
            String type = sc.nextLine().trim();

            System.out.print("Enter monthly fee: ");
            double fee = 0;
            try {
                fee = Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid fee. Using 0.0");
            }

            Insurance ins;
            if (type.equalsIgnoreCase("Health")) {
                ins = new Health(type);
            } else if (type.equalsIgnoreCase("Life")) {
                ins = new Life(type);
            } else {
                System.out.println("Unknown type. Defaulting to Health.");
                ins = new Health("Health");
            }

            ins.setInsuranceCost(fee);
            policies[count++] = ins;

            System.out.print("Add another policy? (y/n): ");
            String answer = sc.nextLine().trim();
            if (!answer.equalsIgnoreCase("y")) {
                more = false;
            }
        }

        System.out.println("\n=== All Policies Entered ===");
        for (int i = 0; i < count; i++) {
            policies[i].displayInfo();
            System.out.println("--------------------------------");
        }

        sc.close();
    }
}

