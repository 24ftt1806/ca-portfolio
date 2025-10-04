import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int totalNumbers= 0;
        int number= 0;
        int count=0;
        int positive= 0;
        int negative= 0; 
        double sumAvg= 0.0;

        System.out.println ("\nEnter n integer, the input ends if it is 0: ");
        
        while (true) {
           number = input.nextInt();
           if (number==0) {
            break;
           }

           if (number>0) {
            positive++;
           } else {
            negative++;
           }
           totalNumbers+=number;
           count++;
        }

        if (count==0) {
            System.out.println("No number is entered except for 0 to end the program. ");
        } else {
            sumAvg=((double)totalNumbers/count);
            System.out.println("The number of positive is "+positive);
            System.out.println("The number of negative is "+negative);
            System.out.println("The total is "+totalNumbers);
            System.out.println("The average is "+sumAvg);
        }

      
        input.close();

    }
}
