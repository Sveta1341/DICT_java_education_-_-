package Hangman;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String args[]) {
        System.out.println("HANGMAN");
        Scanner in = new Scanner(System.in);
        String[] alphabet = new String[]{"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"};
        ArrayList<Character> letters = new ArrayList<>();
        String[] words  = {"python", "java", "javascript", "kotlin"};
        Random r=new Random();
        int randomNumber=r.nextInt(words.length);
        int health = 8;
        String random_word = (words[randomNumber]);
        char[] charArr = random_word.toCharArray();
        for (int i=0;i<charArr.length;i++) {
            charArr[i] = '-';
        }
        for(int i = 0;i<random_word.length();i++){
            letters.add("-".charAt(0));
        }
        while (true){
            int number = 0;
            if(health==0){
                System.out.println("Thanks for playing!\n" +
                        "We`ll see how well you did in the next stage");
                break;
            }
            for(int i = 0;i<random_word.length();i++){
                if (letters.contains(random_word.charAt(i))){
                    number+=1;
                    System.out.print(random_word.charAt(i));
                    if(number==random_word.length()){
                        System.out.println("\n You survived!");
                        System.exit(0);
                    }
                }
                else{System.out.print("-");}

            }
            System.out.println("\n" + "Input a letter:");
            String letter = in.next();
            if (letter.length()>1){
                System.out.println("You should input a single letter.");
                continue;
            }
            if (!Arrays.asList(alphabet).contains(letter)){
                System.out.println("Please enter a lowercase English letter.");
                continue;
            }
            if (random_word.contains(letter)){
                for(int i = 0;i<letters.size();i++){
                    if (letters.get(i).toString().equals("-")){
                        letters.set(i, letter.charAt(0));
                        break;
                    }
                    else if (letters.get(i).toString().equals(letter)){
                        System.out.println("You`ve already guessed this letter.");
                        break;
                    }
                }
            }
            else{
                    System.out.println("That letter doesn't appear in the word");
                    health-=1;
            }

            }
        in.close();
        }
    }









