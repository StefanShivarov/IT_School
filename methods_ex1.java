package com.company;
import java.util.Random;
public class methods_ex1 {

    public static void main(String[] args) {

        int firstDice = rollDice();
        int secondDice = rollDice();
        int sum = firstDice+secondDice;
        printRoll(firstDice, secondDice);

        if(sumIsNatural(sum)){

            System.out.println("You win");

        }else{

            continueGame(sum);
        }

    }

    public static int rollDice(){

        Random random = new Random();

        return random.nextInt(7-1)+1;
    }

    public static void printRoll(int firstDice, int secondDice){

        System.out.println("You rolled "+firstDice+" + "+secondDice+" = "+(firstDice+secondDice));
    }

    public static boolean sumIsNatural(int sum){

        if(sum==7||sum==11){

            return true;
        }else{

            return false;
        }
    }

    public static void continueGame(int sum){

        int nextFirstRoll = rollDice();
        int nextSecondRoll = rollDice();
        while(true){

            printRoll(nextFirstRoll, nextSecondRoll);

            if(nextFirstRoll+nextSecondRoll==sum){

                System.out.println("You win");
                break;
            }else if(nextFirstRoll+nextSecondRoll==7){

                System.out.println("You lose");
                break;
            }

            nextFirstRoll = rollDice();
            nextSecondRoll = rollDice();
        }

    }
}
