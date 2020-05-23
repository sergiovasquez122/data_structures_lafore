import java.util.Scanner;

public class BracketsApp {

    public static void main(String[] args) {
        while(true){
            System.out.print("Enter string containing delimiters: ");
            System.out.flush();
            String input = getString();
            if(input.equals(""))
                break;

            BracketChecker theChecker = new BracketChecker(input);
            theChecker.check();
        }
    }

    public static String getString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
