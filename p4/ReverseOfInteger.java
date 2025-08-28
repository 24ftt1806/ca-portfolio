import java.util.Scanner;

public class ReverseOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       System.out.println("Enter an integer between 100 and 999: ");
       int number = input.nextInt();

       int firstDigit = number / 100; 
       int middleDigit = (number/10) % 10; 
       int lastDigit = number % 10; 
       int reverse = (lastDigit*100) + (middleDigit) + firstDigit;
       System.out.println("The reverse of " +number+ " is " +reverse);
        
        
    }
}
