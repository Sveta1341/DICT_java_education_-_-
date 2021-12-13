package CoffeMachine;
import java.util.Scanner;

public class CoffeMachine {

    public static void main(String args[]) {

            Scanner in = new Scanner(System.in);
            System.out.println("Write how many ml of water the coffee machine has:");
            int water = in.nextInt();
            System.out.println("Write how many ml of milk the coffee machine has:");
            int milk = in.nextInt();
            System.out.println("Write how many grams of coffee beans the coffee machine has:");
            int beans = in.nextInt();
            System.out.println("Write how many cups of coffee you will need:");
            int cups = in.nextInt();
            int w = water / 200;
            int m = milk / 50;
            int b = beans / 15;
            int x = Math.min(w, m);
            int minimum = Math.min(x, b);

           if (minimum < cups){
            System.out.println("No, I can make only "+minimum+" cups of coffee");
            } else if( minimum == cups){
                   System.out.println("Yes, I can make that amount of coffee");
            } else{
                   int min = minimum - cups;
            System.out.println("Yes, I can make that amount of coffee (and even "+min+" more than that)");
            }





    }


}