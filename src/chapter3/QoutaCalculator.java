package chapter3;

import java.util.Scanner;

//if else
public class QoutaCalculator {
    public  static  void  main (String args[]){
        // intialize  known values
        int qouta =10;
        //Get unknown values
        System.out.println("Enter the numbers of sales you made this week:  ");
        Scanner scanner = new Scanner(System.in);
        int sales =scanner.nextInt();
        scanner.close();

        //make a decision
        if(sales>=qouta) {
            System.out.println("Congrats you have met you qouta");
        }
        else {
            int salesShort  =qouta - sales;
            System.out.println("you did not meet your qouta . You were " + salesShort + " Sales short ");
        }
    }
}

