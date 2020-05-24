import java.util.Scanner;

public class PostFixApp {
    public static void main(String[] args) {

        String input;
        int output;
        while(true){
            System.out.print("Enter postfix: ");
            System.out.flush();
            input = getString();
            if( input.equals("") )
                break;

            ParsePost aParser = new ParsePost(input);
            output = aParser.doParse();
            System.out.println("Evaluates to " + output);
        }
    }

    public static String getString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
