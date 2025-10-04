import java.util.Scanner;

public class OccurenceOfMaxNumber {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in); 

          int num = 0;
          int count = 0; 
          int largest = Integer.MIN_VALUE;

          System.out.println("Enter numbers, the input ends with 0 entered: ");

          while (true) {
            num=input.nextInt();
            if (num==0) {
               break; 
            }

            if (num>largest) {
                largest=num;
                count =1; 

            } else if(num==largest) {
                count++;
            }

          }

          
            if (largest==Integer.MIN_VALUE) {
                System.out.println("No numbers were entered. ");
            } else {
                System.out.println("The largest number is "+largest);
                System.out.println("The occurrence count of the largest number is "+count);
            }




    }
}
