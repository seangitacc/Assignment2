package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionThirteen {

    public static void main(String[] args) {

        //Collect ten integers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");

        //Create an array list
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            al1.add(input.nextInt());
        }

        //Remove any duplicate numbers from array
        removeDuplicate(al1);

    }

    /**
     * Removes duplicates from an array list and prints out the distinct integers
     * @param list
     */
    public static void removeDuplicate(ArrayList<Integer> list){

        int num = 0;

        while(num < list.size()){

            for(int i = num + 1; i < list.size(); i++){

                if(list.get(num).equals(list.get(i))){
                    list.remove(i);
                }

            }

            num++;

        }

        System.out.print("The distinct integers are ");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

    }

}


