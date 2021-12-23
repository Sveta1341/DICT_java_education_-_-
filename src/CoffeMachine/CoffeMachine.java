package CoffeMachine;


import java.util.Objects;
import java.util.Scanner;

class Machine{
        private int water = 400;
        private int milk = 540;
        private int beans = 120;
        private int cups = 9;
        private int money = 550;

        public void take(){
                System.out.println("I gave you " + this.money );
                this.money = 0;
        }

        public void setIngridients(Scanner input){
                System.out.println("Write how many ml of water the coffee machine has:");
                this.water += input.nextInt();
                System.out.println("Write how many ml of milk the coffee machine has:");
                this.milk += input.nextInt();
                System.out.println("Write how many grams of coffee beans the coffee machine has:");
                this.beans += input.nextInt();
                System.out.println("Write how many cups the coffee machine has:");
                this.cups += input.nextInt();
        }

        public void getIngridients(){
                System.out.println("The coffee machine has:\n" +
                        this.water + " of water\n" +
                        this.milk + " of milk\n" +
                        this.beans + " of coffee beans\n" +
                        this.cups + " of disposable cups\n" +
                        this.money + " of money");
        }

        public int getWater() {
                return water;
        }

        public int getCups() {
                return cups;
        }

        public int getBeans() {
                return beans;
        }

        public int getMilk() {
                return milk;
        }

        public void examination(int water, int milk, int beans, int money){

                if(getWater()-water>=0 && getMilk()-milk>=0 && getCups()>0 && getBeans()-beans>=0){
                        this.water -= water;
                        this.milk -= milk;
                        this.cups -= 1;
                        this.beans -= beans;
                        this.money += money;
                        System.out.println("I have enough resources,making you a coffee!");
                }else{
                        if (getWater()-water<0){
                                System.out.println("Sorry, not enough water");
                        }
                        if (getMilk()-milk<0){
                                System.out.println("Sorry, not enough milk");
                        }
                        if (getCups() == 0){
                                System.out.println("Sorry, not enough cups");
                        }
                        if(getBeans()-beans<0){
                                System.out.println("Sorry, not enough beans");
                        }
                }

        }
}


public class CoffeMachine {
        public static void main(String args[]) {
                Machine machine = new Machine();
            Scanner in = new Scanner(System.in);
            while (true) {
                    System.out.println("Write action (buy, fill, take,remaining,exit):");
                    String action = in.nextLine();
                    if (Objects.equals(action, "buy")) {
                            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino,back-to main menu:");
                            int coffee = in.nextInt();
                            if (coffee == 1) {
                                    machine.examination(250, 0, 16, 4);
                            } else if (coffee == 2) {
                                    machine.examination(350, 75, 20, 7);
                            } else if (coffee == 3) {
                                    machine.examination(200, 100, 12, 6);
                            }

                    } else if (Objects.equals(action, "fill")) {
                            machine.setIngridients(in);
                    } else if (Objects.equals(action, "take")) {
                            machine.take();
                    } else if (Objects.equals(action, "remaining")) {
                            machine.getIngridients();
                    } else if (Objects.equals(action, "exit")) {
                            break;

                    }
            }
        }
}