package chapter3;

import java.util.Scanner;

/*Nested if
to qualify for a loan , a person must make at least R35000 and have been working at their current job at least 2 years
 */
public class loanQualifier {
    public static  void main (String args[]){
        // intiialize known values
        int reqSalary =35000;
        int reqYears = 2;

        // get unknown values
        System.out.println("Enter your salary : ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer :");
        double years =scanner.nextDouble();

        scanner.close();

        // make a decision

        if(salary>=reqSalary){
            if(years>=reqYears){
                System.out.println("Congrats , you qualify for the loan!");
            }
            else{
                System.out.println("Sorry, you must have worked at your current job " + reqYears+ "years");
            }
        }
        else{
            System.out.println("you must must earn at least " + reqSalary+ " per year");
        }
    }
}
