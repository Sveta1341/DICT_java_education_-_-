package CoffeMachine;
import java.util.Scanner;

public class CoffeMachine {

    public static void main(String args[]) {
            System.out.println("Starting to make a coffee");
            System.out.println("Grinding coffee beans");
            System.out.println("Boiling water");
            System.out.println("Mixing boiled water with crushed coffee beans");
            System.out.println("Pouring coffee into the cup");
            System.out.println("Pouring some milk into the cup");
            System.out.println("Coffee is ready!");

            Scanner in = new Scanner(System.in);
            System.out.println("Write how many cups of coffee you will need:");
            int num = in.nextInt();
            System.out.printf("For "+ num + " cups of coffee you will need:\n");
            int numWater = num*200;
            System.out.printf(numWater + " ml of water\n");
            int numMilk = num*50;
            System.out.printf(numMilk + " ml of milk\n");
            int numBeans = num*15;
            System.out.printf(numBeans + " g of coffee beans\n");





    }
}