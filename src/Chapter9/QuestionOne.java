package Chapter9;

public class QuestionOne {

    public static void main(String[] args) {

        //Create rectangles
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        //Print out information about rectangles
        System.out.println(r1.getWidth());
        System.out.println(r1.getHeight());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());

        System.out.println(r2.getWidth());
        System.out.println(r2.getHeight());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());

    }
}

class Rectangle {

    double width = 1;
    double height = 1;

    public Rectangle(){

    }

    public Rectangle(double width, double height){

        this.width = width;
        this.height = height;

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

}

