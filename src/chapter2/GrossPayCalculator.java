package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public  static void main(String arg[]){

        //get the number of hours worked
        System.out.println("Enter the numbers you worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();


        //get the hourly pay rate
        System.out.println("Enter your pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        //multiply  pay rate and hours
        double grossPay = rate * hours;

        //display result
        System.out.println(grossPay);
    }

}
