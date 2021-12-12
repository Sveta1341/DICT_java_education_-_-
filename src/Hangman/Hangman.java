package Hangman;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
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
        char[] charArr = random_word.toCharArray();
        for (int i=2;i<charArr.length;i++) {
            charArr[i] = '-';
        }
        System.out.println(charArr);
        System.out.println("Guess the word:");
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
