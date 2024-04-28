package AlgorithmExamples;

import java.util.Random;

public class ProbabilityBasedRollingDice {
    public static void main(String[] args) {

        System.out.println("\n\tProbability-Based Rolling Dice Program");
        System.out.println("----------------------------------------------\n");


        Random rand = new Random();


        int dice1;
        int dice2;
        int counter=0;


        while (true){

            counter++;


            dice1 = rand.nextInt(6) + 1;
            dice2 = rand.nextInt(6) + 1;


            System.out.println("1. Dice: "+dice1);
            System.out.println("2. Dice: "+dice2);

            System.out.println("-------------");

            if (dice1 == 6 && dice2 == 5){
                System.out.println("\nThe expected probability was achieved on the " + counter + ". attempt.");
                break;
            }

        }

    }
}
