import java.util.Random;

public class Lotto {
    private int[] numbers = new int[3];
    private Random rnd = new Random();

    // The constructor to fill the array with random numbers 1-9
    public Lotto() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rnd.nextInt(9) + 1; // 1 to 9
        }
    }

    // The getter for the array
    public int[] getNumbers() {
        return numbers;
    }

    // The helper for the sum of the lotto numbers
    public int getSum() {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }
}
