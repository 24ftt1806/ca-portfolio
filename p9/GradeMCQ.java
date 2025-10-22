import java.util.Scanner;

public class GradeMCQ {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        char[][] answers = {
            {'A', 'B', 'C', 'C', 'D', 'A'},
            {'C', 'D', 'B', 'A', 'B', 'B'},
            {'D', 'C', 'D', 'B', 'B', 'A'},
            {'C', 'D', 'A', 'A', 'B', 'C'}
        };

        char[] key = new char[6];

        System.out.print("Enter the key to the MCQ: ");
        String keyInput = input.nextLine().toUpperCase();

        while (keyInput.length() != 6) {
            System.out.print("Key must have 6 characters. Enter again: ");
            keyInput = input.nextLine().toUpperCase();
        }

        for (int i = 0; i < 6; i++) {
            key[i] = keyInput.charAt(i);
        }

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;

            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == key[j]) {
                    correctCount++;
                }
            }

            String result = (correctCount >= 3) ? "passed" : "failed";
            System.out.println("Student " + i + "'s correct count is " + correctCount 
                    + ". Therefore, he/she " + result + " the test.");
        }
    }
}
