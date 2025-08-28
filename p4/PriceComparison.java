import java.util.Scanner;

public class PriceComparison {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      System.out.println("Enter the price of the 1st package: $ ");
      double price1 = input.nextDouble();
      System.out.println("Enter the weight of the 1st package in gram: ");
      double weight1 = input.nextDouble();

      System.out.println("Enter the price of the 2st package: $ ");
      double price2 = input.nextDouble();
      System.out.println("Enter the weight of the 2st package in gram: ");
      double weight2 = input.nextDouble();

      double value1 = weight1 / price1;
      double value2 = weight2 / price2; 
      String results = (value1>value2) ? "it is worth more to buy 1st package"
       : (value1 < value2) ?  "It is worth more to buy the 2nd package" : "Both pacakges are the same value";
       System.out.println("\n" +results);

    }
}
