package Chapter11;

import java.util.Scanner;

public class QuestionOne {

    public static void main(String[] args) {

        //Collect three sides, a color, and a filled status and create a new triangle with them
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three sides of a triangle: ");
        Triangle t1 = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
        System.out.print("Enter the color of the triangle: ");
        t1.setColor(input.next());
        System.out.print("Enter if the triangle is filled (true/false): ");
        t1.setFilled(input.nextBoolean());

        //Print out the triangle's information
        System.out.println("The area is: " + t1.getArea());
        System.out.println("The perimeter is: " + t1.getPerimeter());
        System.out.println("The color is: " + t1.getColor());
        System.out.println("Is it filled? " + t1.isFilled());


    }

}

class GeometricObject {

    String color = "";
    boolean isFilled;

    GeometricObject(){
        color = "Red";
        isFilled = true;
    }

    GeometricObject(String color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }
}

class Triangle extends GeometricObject{

    double side1, side2, side3 = 1.0;


    Triangle(){

    }

    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    /**
     * Calculate the area of the triangle
     * @return the area
     */
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    /**
     * Override toString to create a new toString to print out a triangle's info
     * @return the triangle's sides
     */
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 +
                " side3 = " + side3;
    }
}
