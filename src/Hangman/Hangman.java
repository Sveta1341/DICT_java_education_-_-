package Hangman;
import java.util.Scanner;

public class Hangman {
    public static void main(String args[]) {
        System.out.println("HANGMAN");
        Scanner in = new Scanner(System.in);
        System.out.println("Guess the word: ");
        String word = in.next();

            if (word.equals("java")) {
                System.out.println("You survived!");

            } else {
                System.out.println("You lost!");
            }

        in.close();
    }
}
