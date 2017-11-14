package Chapter12;

import java.io.File;
import java.util.Scanner;

public class QuestionThirteen {

    public static void main(String[] args) throws Exception {

        //check to make sure user input is correct
        if (args.length != 1) {
            System.out.println("Usage: java filename");
            System.exit(1);
        }

        //Does the file exist?
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File " + args[0] + " does not exist");
            System.exit(2);
        }

        int characters = 0;
        int words = 0;
        int lines = 0;

        try (
                Scanner input = new Scanner(file);
        ) {
            //Count the lines and characters
            while (input.hasNext()) {
                lines++;
                String line = input.nextLine();
                characters += line.length();
            }
        }

        try (
                Scanner input = new Scanner(file);
        ) {
            //Count the words in the lines
            while (input.hasNext()) {
                String line = input.next();
                words++;
            }
        }

        //Print out information
        System.out.println("File " + file.getName() + " has");
        System.out.println(characters + " characters");
        System.out.println(words + " words");
        System.out.println(lines + " lines");
    }

}
