package Chapter9;

public class QuestionNine {

    public static void main(String[] args) {

        //Create 3 regular polygons
        RegularPolygon rp1 = new RegularPolygon();
        RegularPolygon rp2 = new RegularPolygon(6, 4);
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8);

        //Print out information about regular polygons
        System.out.println(rp1.getArea());
        System.out.println(rp1.getPerimeter());
        System.out.println(rp2.getArea());
        System.out.println(rp2.getPerimeter());
        System.out.println(rp3.getArea());
        System.out.println(rp3.getPerimeter());

    }

}

class RegularPolygon{

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon(){

    }

    public RegularPolygon(int n, int side){
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, int side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public double getPerimeter(){
        return side * n;
    }

    //Find the area of a regular polygon with given function
    public double getArea(){
        return (n * (side * side)) / (4 * (Math.tan(Math.PI / n)));
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}