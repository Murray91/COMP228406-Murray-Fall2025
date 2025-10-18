package Lab3exercise2;

public class PartTimeGameTester extends GameTester {
    private int hoursWorked;
    private static final double HOURLY_RATE = 20.0;

    public PartTimeGameTester(String name, int hoursWorked) {
        super(name, false);
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public double determineSalary() {
        return hoursWorked * HOURLY_RATE;
    }
}

