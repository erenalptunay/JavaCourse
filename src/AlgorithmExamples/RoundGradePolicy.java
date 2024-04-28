package AlgorithmExamples;

import java.util.Scanner;

public class RoundGradePolicy {
    public static void main(String[] args) {

        System.out.println("\n\tRound Grade Policy Program");
        System.out.println("----------------------------------\n");


        int grade;


        Scanner sc = new Scanner(System.in);


        do{
            System.out.printf("Enter the grade (0-100): ");
            grade = sc.nextInt();

        }while(grade < 0 || grade > 100);


        if (grade<40){

            System.out.println("\nYou fail with " + grade + ".");

        }else {

            int roundedGrade = gradingStudents(grade);
            System.out.println("\nYou pass with " + roundedGrade + ".");

        }


    }


    public static int gradingStudents(int grade){

        for (int i = grade; i <= 100 ; i++){

            for (int j = 0; j <= 100; j = j+5){

                if ( i==j && (j-grade)<3 ){

                    grade = j;
                    break;
                }
            }
        }

        return grade;
    }

}
