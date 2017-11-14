package Chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionEleven {

    public static void main(String[] args) throws Exception {

        //Make sure user input is correct
        if (args.length != 2) {
            System.out.println("Usage: java RemoveText filename");
            System.exit(1);
        }

        //Does the file exist?
        File file = new File(args[1]);
        if (!file.exists()) {
            System.out.println("File " + args[1] + " does not exist");
            System.exit(2);
        }

        //Create a new array list
        ArrayList<String> s2 = new ArrayList<>();
        try (
                Scanner input = new Scanner(file);
        ) {
            //Remove a speified string from a file
            while (input.hasNext()) {
                String s1 = input.nextLine();
                s2.add(removeString(args[0], s1));
            }
        }

        try (
                //Output goes here
                PrintWriter output = new PrintWriter(file);
        ) {
            for (int i = 0; i < s2.size(); i++) {
                output.println(s2.get(i));
            }
        }
    }

    /**
     * Remove a string from a file
     * @param string
     * @param line
     * @return stringBuilder.toString()
     */
    public static String removeString(String string, String line) {
        StringBuilder stringBuilder = new StringBuilder(line);
        int start = stringBuilder.indexOf(string);
        int end = string.length();

        while (start >= 0) {
            end = start + end;
            stringBuilder = stringBuilder.delete(start, end);
            start = stringBuilder.indexOf(string, start);
        }

        return stringBuilder.toString();
    }

}
