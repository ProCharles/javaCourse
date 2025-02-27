package chapter6;
//this is a blueprint of the rectangle class

public class Rectangle  {
    private double length;
    private double width;


    public Rectangle(){
        length=0;
        width=0;
    }

    public  Rectangle(double length,double width){
     this.length= length; // can be set this way
     setWidth(width);     // or can be set this way
    }


    public double getLength(){
    return length;
    }

     public void setLength(double length){
        this.length=length;
    }

    public double getWidth(){
        return width;
    }

     public void setWidth(double width){
        this.width=width;
    }


    public double calculateParemeter() {
        return (2*length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}
