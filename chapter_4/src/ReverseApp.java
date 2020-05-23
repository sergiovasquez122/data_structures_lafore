import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseApp {
    public static void main(String[] args) {
        String input, output;
        while(true){
            System.out.print("Enter a string: ");
            System.out.flush();
            input = getString();
            if( input.equals("") )break;

            Reverser theReverse = new Reverser(input);
            output = theReverse.doRev();
            System.out.println("Reversed: " + output);
        }
    }

    public static String getString(){
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
