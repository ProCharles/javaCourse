package chapter3;

import java.util.Scanner;

// if-else-if statements
public class TestReuslts {
    public static void main (String args []){
        System.out.println("Enter your test score : ");

        Scanner scanner = new Scanner(System.in);
        double  testScore = scanner.nextDouble();

        //determine letter grade
        char grade;
        if(testScore<50){
            grade = 'F';
        }
        else if (testScore<60){
            grade = 'E';
        }
        else if (testScore<70){
            grade = 'D';
        }
        else if (testScore<80){
            grade = 'C';
        }
        else if (testScore<90){
            grade = 'B';
        }
        else{
            grade = 'A';
        }
        System.out.println("your grade is " + grade );
    }
}
