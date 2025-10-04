import javax.swing.JOptionPane;
import java.util.Random;

public class Test {
    private final String[] prompts = {
            "1. What is Java?\n1) A programming language\n2) A coffee brand\n3) A game\n4) A movie",
            "2. Which keyword is used to create a class?\n1) class\n2) object\n3) method\n4) main",
            "3. Which operator is used for addition?\n1) +\n2) -\n3) *\n4) /",
            "4. What is the size of int in Java?\n1) 8-bit\n2) 16-bit\n3) 32-bit\n4) 64-bit",
            "5. Which method is the entry point of a Java program?\n1) start()\n2) main()\n3) run()\n4) init()"
    };

    private final int[] correctAnswers = {1, 1, 1, 3, 2};
    private int correctCount = 0;
    private int incorrectCount = 0;
    private final Random rnd = new Random();

    public void simulateQuestion(int index) {
        String input = JOptionPane.showInputDialog(null, prompts[index],
                "Question " + (index+1),
                JOptionPane.QUESTION_MESSAGE);

        int answer = -1;
        if (input != null) {
            try {
                answer = Integer.parseInt(input.trim());
            } catch (NumberFormatException e) {
                // invalid input, leave answer = -1
            }
        }
        checkAnswer(index, answer);
    }

    public void checkAnswer(int index, int answer) {
        int correct = correctAnswers[index];
        if (answer == correct) {
            correctCount++;
            JOptionPane.showMessageDialog(null, generateMessage(true));
        } else {
            incorrectCount++;
            JOptionPane.showMessageDialog(null, generateMessage(false) +
                    " Correct answer: " + correct);
        }
    }

    public String generateMessage(boolean correct) {
        switch (rnd.nextInt(4)) {
            case 0: return correct ? "Excellent!" : "No. Please try again.";
            case 1: return correct ? "Good!" : "Wrong. Try once more.";
            case 2: return correct ? "Keep up the good work!" : "Don't give up!";
            default: return correct ? "Nice work!" : "No. Keep trying..";
        }
    }

    public void inputAnswer() {
        for (int i = 0; i < prompts.length; i++) {
            simulateQuestion(i);
        }
        int total = correctCount + incorrectCount;
        double percentage = total == 0 ? 0.0 : (correctCount * 100.0) / total;
        JOptionPane.showMessageDialog(null,
                "Test Completed!\nCorrect Answers: " + correctCount +
                        "\nIncorrect Answers: " + incorrectCount +
                        "\nPercentage: " + String.format("%.2f", percentage) + "%");
    }
}
