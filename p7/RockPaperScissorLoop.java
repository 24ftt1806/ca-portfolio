import java.util.Scanner;

public class RockPaperScissorLoop {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
    int rounds=0;
    int userScore=0;
    int computerScore=0;

    while (true) {
        System.out.println("Enter rock(0), paper(1), scissor(2): ");
        int user=input.nextInt();
        int computer=(int)(Math.random()*3);

      
        if (user==computer) {
            System.out.print("its a draw. ");
        } else if((user==0 && computer==2)||(user==1 && computer==0)||(user==2 && computer==1))  {
           System.out.println("The computer is  "+computer+". You are "+user+". You win!"); 
           userScore++;
        }else{
            System.out.println("The computer is "+computer+". You are "+user+". You lose!");
            computerScore++;
        }

        rounds++;
        System.out.print("Enter y to play again: ");
        char choice = input.next().charAt(0);

        if (choice != 'y' && choice != 'Y') {
            System.out.print("In the total of "+rounds+" round, you scored "+userScore+", Computer scored "+computerScore);
            if (userScore>computerScore) {
                System.out.println("You win the game!");
            } else if(userScore<computerScore) {
                System.out.println("Computer win the game!");
            }else{
                System.out.println("It is a draw game");
            }
        } 

    }


    }
}
