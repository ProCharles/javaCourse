package chapter4;

//while loop

import java.util.Scanner;

public class GrossPayValidation {
    public static void main (String args[]) {
        //initialize the known values
        int rate =15;
        int maxHours =40;

        //get input for the unkwown
        System.out.println("how many hours did yo work this week ");
        Scanner scanner = new Scanner( System.in);
        double hourWorked = scanner.nextDouble();

        //validate input
        while(hourWorked>maxHours || hourWorked < 1) {
            System.out.println("Invaalid entry , your hours must be between 1 and 40 , Try again ");
            hourWorked = scanner.nextDouble();
        }

        scanner.close();

        //calculate the gross
        double gross = rate * hourWorked;
        System.out.println("Gross pays : R " +gross);
    }
}
