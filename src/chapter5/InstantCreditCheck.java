package chapter5;

import java.util.Scanner;

//an application that checks if the user qualifies for credit by entering their credit score and salary
public class InstantCreditCheck {
     static  int reqSalary =30000;
     static  int reqCreditScore =700;
      static Scanner scanner = new Scanner(System.in);


     public static  void  main (String args[]){
          //get what we do not know
         double salary = getSalary();
          int creditScore = getCreditScore();
         scanner.close();

         //check if the user qualifies
         boolean qualified = isUserQualified(creditScore,salary);

         //notify the user
         notifyUser(qualified);
     }

     public static double getSalary(){
         System.out.println("Enter your salary : ");

         double salary=scanner.nextDouble();
         return salary;
     }

     public  static  int getCreditScore(){
         System.out.println("Enter your credit score : ");
         int creditScore =scanner.nextInt();
         return creditScore;
     }
     public  static  boolean isUserQualified(int creditScore , double salary){
         if(creditScore >= reqCreditScore && salary>=reqSalary){
             return  true;

         } else{
             return false;

         }
     }

     public static  void notifyUser ( boolean isQualified){
         if(isQualified){
             System.out.println("Congrats you have been approved");

         }
         else{
             System.out.println("Sorry, you have been decline");
         }
     }
}
