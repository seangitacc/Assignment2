package Chapter9;

import java.util.Scanner;

public class QuestionEleven {

    public static void main(String[] args) {

        //Prompt user to enter a, b, c, d, e, f
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");

        //Create a linear equation object with inputs
        LinearEquation le1 = new LinearEquation(input.nextDouble(),input.nextDouble(), input.nextDouble(),
                input.nextDouble(), input.nextDouble(), input.nextDouble());

        //Print out the input
        System.out.println(le1.getA());
        System.out.println(le1.getB());
        System.out.println(le1.getC());
        System.out.println(le1.getD());
        System.out.println(le1.getE());
        System.out.println(le1.getF());

        //Find if it is solvable, if it is, print x and y
        if(!(le1.isSolvable())){
            System.out.println("The equation has no solution");
        }else{
            System.out.println(le1.getX());
            System.out.println(le1.getY());
        }

    }

}

class LinearEquation{

    private double a, b, c, d, e, f;

    public LinearEquation(double a, double b, double c, double d, double e, double f){

        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;

    }

    //Check to see if the equation is solvable
    public boolean isSolvable(){
        return ((a * b) - (b * c)) != 0;
    }

    //Solve for x
    public double getX(){
        return (((e * d) - (b * f)) / ((a * d) - (b * c)));
    }

    //Solve for y
    public double getY(){
        return (((a * f) - (e * c)) / ((a * d) - (b * c)));
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
}
