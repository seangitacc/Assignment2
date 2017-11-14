package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionTen {

    public static void main(String[] args) {

        //Create a new stack
        MyStack ms1 = new MyStack();

        //Add five strings
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter five strings...");
        System.out.print("String 1: ");
        ms1.add(input.next());
        System.out.print("String 2: ");
        ms1.add(input.next());
        System.out.print("String 3: ");
        ms1.add(input.next());
        System.out.print("String 4: ");
        ms1.add(input.next());
        System.out.print("String 5: ");
        ms1.add(input.next());

        //Reverse the strings
        System.out.println(ms1.reverse());

    }

}

class MyStack extends ArrayList {

    public MyStack() {

    }

    /**
     * Reverse a ser of strings
     * @return newStr
     */
    public String reverse() {
        String newStr = "";

        for(int i = size() - 1; i >= 0; i--){
            newStr += get(i);
        }

        return newStr;
    }

}