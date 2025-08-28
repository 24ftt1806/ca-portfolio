import java.util.Scanner;

public class MoneyChanger {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in); 
       System.out.println("Enter 1 to convert BND to RM and 2 vice versa: ");
       int choice = input.nextInt();
       System.out.println("Enter the amount to be converted: $ ");
       double amount = input.nextDouble();
       double results = (choice==1) ? (amount*3) : (amount/3);
       System.out.printf("The change is $%.2f\n" , results);
   } 
}
