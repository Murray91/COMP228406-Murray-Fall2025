import javax.swing.JOptionPane;

public class LottoDriver {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(
                "Welcome to Lotto!\nChoose a number between 3 and 27:");
        int userNumber = Integer.parseInt(input);

        boolean userWon = false;

        for (int attempt = 1; attempt <= 5; attempt++) {
            Lotto lotto = new Lotto();
            int sum = lotto.getSum();

            // Show the generated numbers
            JOptionPane.showMessageDialog(null,
                    "Attempt " + attempt + ": Numbers = " +
                            lotto.getNumbers()[0] + ", " +
                            lotto.getNumbers()[1] + ", " +
                            lotto.getNumbers()[2] +
                            "\nSum = " + sum);

            if (sum == userNumber) {
                JOptionPane.showMessageDialog(null,
                        "Congratulations! You have matched the sum in " + attempt + " attempt(s)!");
                userWon = true;
                break;
            }
        }

        if (!userWon) {
            JOptionPane.showMessageDialog(null, "Sorry, you have lost. Computer wins!");
        }

        System.exit(0);
    }
}

