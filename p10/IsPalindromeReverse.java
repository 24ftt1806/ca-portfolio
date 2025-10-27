import java.util.Random;
import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    int correctCount = 0; 

    for (int i = 0; i < 3; i++) {
        int number = rand.nextInt(900) + 100; 

        System.out.print("\nEnter the reverse of " + number + ": ");
        int userReverse = input.nextInt();

         while (userReverse < 100 || userReverse > 999) {
          System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
          userReverse = input.nextInt();
         }

        int actualReverse = reverse(number);
        boolean result = isPalindrome(userReverse, actualReverse);

        System.out.println("The digit " + userReverse + " is palindrome of " + number + " is " + result + ".");

        if (result) {
          correctCount++;
      }
    }

  }
     public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
      public static boolean isPalindrome(int number, int reverse) {
        return number == reverse;
    }
}
