package Lab3exercise2;

import java.util.Scanner;

public class GameTesterApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Game Tester Application ===");
        System.out.print("Enter tester's name: ");
        String name = sc.nextLine().trim();

        System.out.print("Is the tester full-time? (y/n): ");
        String full = sc.nextLine().trim();

        if (full.equalsIgnoreCase("y")) {
            FullTimeGameTester ft = new FullTimeGameTester(name);
            System.out.printf("Name: %s%nStatus: Full-time%nSalary: $%.2f%n",
                    ft.getName(), ft.determineSalary());
        } else {
            System.out.print("Enter hours worked (integer): ");
            int hours = 0;
            try {
                hours = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number; using 0 hours.");
            }
            PartTimeGameTester pt = new PartTimeGameTester(name, hours);
            System.out.printf("Name: %s%nStatus: Part-time%nHours: %d%nSalary: $%.2f%n",
                    pt.getName(), pt.getHoursWorked(), pt.determineSalary());
        }

        sc.close();
    }
}
