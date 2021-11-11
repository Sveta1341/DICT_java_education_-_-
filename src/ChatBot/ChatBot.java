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
        in.close();
    }
}