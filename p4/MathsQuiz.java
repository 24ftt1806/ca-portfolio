import java.util.Scanner;

public class MathsQuiz {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        

       int min = 0 , max = 101; 
       int range = max-min;                                          
       int randomNumber1 = (int)(Math.random()*(range)+min);
       int randomNumber2 = (int)(Math.random()*(range)+min);
       
       System.out.println("What is "+ randomNumber1 + "+" +randomNumber2 + "?");
       int userSum = input.nextInt();
       int correctSum = randomNumber1 + randomNumber2; 
       boolean sumCheck = ( userSum == correctSum);
       System.out.println(randomNumber1 + " + "+ randomNumber2 + " = " +userSum+ " is " +sumCheck);

       System.out.println("What is " +randomNumber1+ " % " +randomNumber2+ "?");
       int userModulus = input.nextInt();
       int correctModulus = randomNumber1 + randomNumber2; 
       boolean modulusCheck = ( userModulus == correctModulus);
       System.out.println(randomNumber1 + " % "+ randomNumber2 + " = " +userModulus+ " is " +modulusCheck);
    }
}
