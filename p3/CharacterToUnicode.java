import java.util.Scanner;

public class CharacterToUnicode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);

        System.out.println("The Unicode for charcter " + ch + " is " + (int)ch);
    }
}
