package ChatBot;
import java.util.Scanner;





public class ChatBot{
    public String name;
    public double year;

    public ChatBot (String botName, double numYear){
        name = botName;
        year = numYear;
    }


    public void printBot(){
        System.out.println("Hello! My name is " + name );
        System.out.println("I was created in " + year );
        System.out.println("Please, remind me your name." );

    }

    public static void main(String args[]){
        ChatBot empOne = new ChatBot("Aboba", 2021);
        empOne.printBot();
        Scanner in = new Scanner(System.in);
        String num = in.nextLine();
        System.out.printf("What a great name you have, %s ", num + "!");

        System.out.println("Let me guess your age.\n" +
                "Enter remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = in.nextInt();
        int remainder5 = in.nextInt();
        int remainder7 = in.nextInt();
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.printf("Your age is %d;that`s a good time to start programming!\n" , age );
        System.out.println("Now I will prove to you that I can count to any number you want");
        int number = in.nextInt();
        for (int i = 0; i <= number; i++){
            System.out.printf( "%d !\n", i);
        }
        in.close();
    }
}