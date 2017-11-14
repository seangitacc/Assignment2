package Chapter13;

public class QuestionTen {

    public static void main(String[] args) {
        // Create three Rectangle objects
        Rectangle r1 = new Rectangle(3, 5, "blue", true);
        Rectangle r2 = new Rectangle(5, 3, "gray", false);
        Rectangle r3 = new Rectangle(3.1, 5, "blue", true);

        System.out.println("Rectangle1 Area :" + r1.getArea());
        System.out.println("Rectangle2 Area :" + r2.getArea());
        System.out.println("Rectangle3 Area :" + r3.getArea());

        System.out.println("Rectangle1 is " + (r1.equals(r2) ? "" : "not ") +
                "equal to Rectangle2");

        System.out.println("Rectangle1 is " + (r1.equals(r3) ? "" : "not ") +
                "equal to Rectangle3");
    }

}

abstract class GeometricObjectModifiedAgain {
    private String color = "while";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Construct a default geometric object */
    protected GeometricObjectModifiedAgain() {
        dateCreated = new java.util.Date();
    }

    /** Construct a geometric object with color and filled value */
    protected GeometricObjectModifiedAgain(String color, boolean filled) {
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

class RectangleModified extends GeometricObjectModifiedAgain implements Comparable<Rectangle> {
    private double width;
    private double height;

    public RectangleModified() {
    }

    public RectangleModified(
            double width, double height) {
        this.width = width;
        this.height = height;
    }

    public RectangleModified(
            double width, double height, String color, boolean filled) {
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

    @Override /** Implement compareTo method */
    public int compareTo(Rectangle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override /** Return true if both objects are equal */
    public boolean equals(Object o) {
        return this.compareTo((Rectangle)o) == 0;
    }

    @Override /** Return String discription of this rectangle */
    public String toString() {
        return super.toString() + "\nWidth: " + width + "\nHeight: " + height
                + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
