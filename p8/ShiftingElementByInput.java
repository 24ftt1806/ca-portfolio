import java.util.Scanner;

public class ShiftingElementByInput {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("How many numbers are there? ");
      int num = input.nextInt();

      int[] numbers = new int[num];
      System.out.println("Enter the "+num+" numbers: ");
      for (int i = 0; i < num; i++) {
        numbers[i] = input.nextInt();
      }

      System.out.print("Enter number of left shift: ");
      int shift = input.nextInt();

      for (int s = 0; s < shift; s++) {
        int first = numbers[0];
        for (int i = 0; i < num - 1; i++) {
             numbers[i] = numbers[i+1]; 
        }
        numbers[num-1] = first; 
      }

      System.out.print("The shifted arrangement is: ");
      for (int numb : numbers) {
        System.out.print(numb +" ");
      }
      
    }
}
