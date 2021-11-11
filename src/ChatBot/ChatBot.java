package ChatBot;

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

    }

    public static void main(String args[]){
        ChatBot empOne = new ChatBot("Aboba", 2021);
        empOne.printBot();
    }
}