package chapter5;

import java.util.Scanner;

//Methods
// a method that asks a user  for their name and greet them by name
public class Greetings {
    public  static  void  main (String args[]){
        System.out.println("Please enter your name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }
    public static void greetUser(String name){
        System.out.println( " Hi there, " + name);
    }
}
