package Hangman;
import java.util.Scanner;
import java.util.Random;

public class Hangman {
    public static void main(String args[]) {
        System.out.println("HANGMAN");
        Scanner in = new Scanner(System.in);
        String[] words  = {"python", "java", "javascript", "kotlin"};
        Random r=new Random();
        int randomNumber=r.nextInt(words.length);
        String random_word = (words[randomNumber]);
        System.out.println("Guess the word: ");

        while(true){
            String word = in.next();
            if (word.equals(random_word)) {
            System.out.println("You survived!");
            break;
            }else{
            System.out.println("You lost!");}
        }

        in.close();
    }

}
