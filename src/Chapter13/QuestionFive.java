package Chapter13;

public class QuestionFive {

    public static void main(String[] args) {
        // Create two Circle objects
        Circle circle1 = new Circle(15, "red", true);
        Circle circle2 = new Circle(10, "blue", false);

        // Display circle1
        System.out.println("\nCircle 1: ");
        print(circle1);

        // Display circle2
        System.out.println("\nCircle 2: ");
        print(circle2);

        // Display larger circle
        print("\nThe larger of the two circles was ");
        print(Circle.max(circle1, circle2));

        // Create two Rectangle objects
        Rectangle rectangle1 = new Rectangle(4, 5, "green", true);
        Rectangle rectangle2 = new Rectangle(4.2, 5, "orange", true);

        // Display circle1
        System.out.println("\nRectangle 1: ");
        print(circle1);

        // Display circle2
        System.out.println("\nRectangle 2: ");
        print(circle2);

        // Display larger circle
        print("\nThe larger of the two rectangles was ");
        print(Rectangle.max(rectangle1, rectangle2));
    }

    // Displays a string
    public static void print(String s) {
        System.out.println(s);
    }

    // Displays a GeometricObject
    public static void print(GeometricObjectModified o) {
        System.out.println(o);
    }

}

abstract class GeometricObjectModified implements Comparable<GeometricObjectModified> {
    private String color = "while";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObjectModified() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObjectModified(String color, boolean filled) {
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

    @Override // Implement the compareTo method defined in Comparable
    public int compareTo(GeometricObjectModified o) {
        if (this.getArea() > o.getArea())
            return 1;
        else if (this.getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    /** Abstract method getMax */
    public static GeometricObjectModified max(GeometricObjectModified o1, GeometricObjectModified o2) {
        return o1.compareTo(o2) == 1 ? o1 : o2;
    }

    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();
}

class Rectangle extends GeometricObjectModified {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor(color);
        setFilled(filled);
    }

    /** Return width */
    public double getWidth() {
        return width;
    }

    /** Set a new width */
    public void setWidth(double width) {
        this. width = width;
    }

    /** Return height */
    public double getheight() {
        return height;
    }

    /** Set a new height */
    public void setheight(double height) {
        this.height = height;
    }

    @Override /** Return area */
    public double getArea() {
        return width * height;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * (width * height);
    }

    @Override /** Return String discription of this rectangle */
    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nHeight: " + height
                + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}

class Circle extends GeometricObjectModified {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,
                  String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override /** Return String discription of Circle object */
    public String toString() {
        return super.toString() + "\nRadius: " + radius + "\nArea: " + getArea() +
                "\nDiameter: " + getDiameter() + "\nPerimeter: " + getPerimeter();
    }
}