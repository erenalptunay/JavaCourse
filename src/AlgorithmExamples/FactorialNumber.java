package AlgorithmExamples;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        System.out.println("\n\tFactorial Number Program");
        System.out.println("--------------------------------\n");

        int number;
        int result= 1;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter a number: ");
        number = sc.nextInt();

        if (number == 0) {
            result = 1;
            System.out.println("\n" + number + "! is equal to " + result);

        }else if(number <0){
            System.out.println("Error!\nThe number must be a positive integer.");


        }else {
            for (int i = 1; i <= number; i++)
                result *= i;

            System.out.println("\n" + number + "! is equal to " + result + ".");

        }



    }
}
