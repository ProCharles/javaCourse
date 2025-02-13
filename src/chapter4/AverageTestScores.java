package chapter4;

//Nested loops

import java.util.Scanner;

public class AverageTestScores {
    public static void main (String args[]){
        int numOfStudents = 24;
        int numOfTests=4;
        Scanner scanner = new Scanner(System.in);

     //process the students
        for(int i =0; i<numOfTests; i++){
             double total =0 ;
            for( int  x=0; x < numOfTests; x++){
                System.out.println("Enter the  test score for TEst #" +(x+1));
                double score = scanner.nextDouble();
                total= total+score;
            }
            double average = total/numOfTests;
            System.out.println("The test average for student #" +(i+1) + " is " + average);
        }


    }
}
