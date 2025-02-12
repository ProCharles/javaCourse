package chapter3;

//Switch statements

import java.util.Scanner;
public class GradeMessage {
    public static void main (String args[]){

        System.out.println("Enter you letter grade : ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String message;
        switch (grade){
            case "A":
                message = "Excellent Job";
                break;
            case "B":
                message = "Great Job";
                break;
            case "C":
                message = "Good Job";
                break;
            case "D":
                message ="You need to work a little bit harder";
                break;
            case "E":
                message = "You need to do better";
                break;
            default:
                message = " Error invalid grade";
                break;
        }
    }
}
