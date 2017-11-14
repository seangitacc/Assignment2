package Chapter10;

public class QuestionTwentySix {

    public static void main(String[] args) {

        String a = args[0].replaceAll(" ","");
        a = a.replaceAll("[+]","#+#");
        a = a.replaceAll("[-]","#-#");
        a = a.replaceAll("[*]","#*#");
        a = a.replaceAll("[/]","#/#");
        args = a.split("#");

        //Check to make sure user input is in the proper format
        if (args.length != 3) {
            System.out.println(
                    "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        int result = 0;

        //Need to determine whether its addition, subtraction, etc.
        switch (args[1].charAt(0)) {
            case '+' :
                result = Integer.parseInt(args[0]) +
                        Integer.parseInt(args[2]);
                break;
            case '-' :
                result = Integer.parseInt(args[0]) -
                    Integer.parseInt(args[2]);
                break;
            case '*' :
                result = Integer.parseInt(args[0]) *
                    Integer.parseInt(args[2]);
                break;
            case '/' :
                result = Integer.parseInt(args[0]) /
                    Integer.parseInt(args[2]);
                break;
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }

}


