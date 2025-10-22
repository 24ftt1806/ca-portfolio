import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

      int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }

        for (int i = 0; i < numbers.length; i++) {
            int randomIndex = rand.nextInt(numbers.length);
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }

        int[] answer = new int[4];
        for (int i = 0; i < 4; i++) {
            answer[i] = numbers[i];
        }

        int chances = 10;
        boolean win = false;

        while (chances > 0 && !win) {
            System.out.print("Guess 4 numbers (no duplicates): ");
            int[] guess = new int[4];
            boolean hasDuplicate = false;

            for (int i = 0; i < 4; i++) {
                guess[i] = input.nextInt();
            }
            for (int i = 0; i < 4; i++) {
                for (int j = i + 1; j < 4; j++) {
                    if (guess[i] == guess[j]) {
                        hasDuplicate = true;
                        break;
                    }
                }
            }

            if (hasDuplicate) {
                System.out.println("Duplicates detected in your guess. Try again.\n");
                continue;
            }

            int score = 0;
            for (int i = 0; i < 4; i++) {
                if (guess[i] == answer[i]) {
                    score++;
                }
            }

            chances--;

            if (score == 4) {
                System.out.println("You Won! You got the actual number!");
                win = true;
            } else {
                System.out.println("You have score " + score + " out of the 4 numbers. You have " + chances + " chances left.\n");
            }
        }

        if (!win) {
            System.out.print("You lose! The correct numbers were: ");
            for (int i = 0; i < 4; i++) {
                System.out.print(answer[i] + " ");
            }
            System.out.println();
        }

 }
}
