import java.util.Scanner;

public class Savings {
    public static void main(String[] args) {
        final int DAYS_IN_MONTH = 30;
        Scanner input = new Scanner(System.in);

        System.out.print("What is your target amount? $");
        double targetAmount = input.nextDouble();

        System.out.print("How many month(s) to reach your goal? ");
        int months = input.nextInt();

        double amountPerDay = targetAmount / (months * DAYS_IN_MONTH);

        System.out.printf("The amount you need to save per day is %.2f\n", amountPerDay);
    }
}
