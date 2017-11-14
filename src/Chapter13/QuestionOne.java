package Chapter13;

import java.util.Scanner;

public class QuestionOne {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three sides of a triangle a color
        // and a Boolean value to indicate whether the triangle is filled
        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();

        // Create a Triangle
        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println(triangle);
    }

}

class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(){
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3,
                    String color, boolean filled) {
        this(side1, side2, side3);
        setColor(color);
        setFilled(filled);
    }

    /** Return side1 */
    public double getSide1() {
        return side1;
    }

    /** Set side1 to a new lentgh */
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    /** Return side2 */
    public double getSide2() {
        return side2;
    }

    /** Set side2 to a new lentgh */
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    /** Return side3 */
    public double getSide3() {
        return side3;
    }

    /** Set side3 to a new lentgh */
    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override /** Return area of this Triangle */
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override /** Return perimeter of this triangle */
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override /** Return a string discription of the object */
    public String toString() {
        return super.toString() + "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }
}

abstract class GeometricObject {
    private String color = "while";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    /** Return color */
    public String getColor() {
        return color;
    }

    /** Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Return filled. Since filled is boolean,
     *  the get method is named isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Get dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}
