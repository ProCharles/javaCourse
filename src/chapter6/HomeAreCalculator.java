package chapter6;
// a class that creates instances of the rectangele class to find the total area of two rooms in a house
public class HomeAreCalculator {
    public  static  void  main (String args[]) {
        ///Rectangele 1

        //create instance of Rectangle class
        Rectangle room1 = new Rectangle();
         room1.setWidth(25);
         room1.setLength(50);
         double areaOfRoom1 = room1.calculateArea();

        ///Rectangele 1
        //create instance of Rectangle class
        Rectangle room2 = new Rectangle(30,75);
        double areaOfRoom2= room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Are of both rooms " + totalArea + " cm");


    }
}

