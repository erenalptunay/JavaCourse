package AlgorithmExamples;

import java.util.Scanner;

public class OddOrEvenNumbers {
    public static void main(String[] args) {

        System.out.println("\n\tOdd Or Even Numbers");
        System.out.println("---------------------------\n");

        int number;
        String statment = "...";

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        number = sc.nextInt();

        if (number % 2 == 0) {
            statment = "even";
        }else {
            statment = "odd";
        }


        System.out.println("\nThe number that you choose is an " + statment + " number.");

    }
}
