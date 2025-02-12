package chapter3;
/*

 if Statement.
 all salespeople get a salary of R3000 a week
 salespeople who exceed 10 sales get an additional bonus of R500
 */


import java.util.Scanner;

public class salaryCalculator {
    public static  void  main (String args[]){
        //initialize known values
         int salary =3000;
         int bonus = 500 ;

        // get values for the unknown
        System.out.print("how many sale did the employeee make this week ? ");
        Scanner scanner = new Scanner(System.in) ;
        int sales = scanner.nextInt();
        scanner.close();

        //for bonus earners
        if(sales>10){
            salary = salary + bonus;
        }

        //output
        System.out.println("The employee's pay is R " + salary);
    }

}
