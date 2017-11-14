package Chapter12;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionThree {

    public static void main(String[] args) {

        //Create an array list
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Fill it with 100 random numbers
        for(int i = 0; i < 100; i++){
            list.add((int) (Math.random() * 100));
        }

        //See if an index exists, if not, return out of bounds
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an index: ");
            int id = input.nextInt();

            System.out.println(list.get(id));

        }catch(IndexOutOfBoundsException ex){
            System.out.println("Out of Bounds!");
        }
    }

}
