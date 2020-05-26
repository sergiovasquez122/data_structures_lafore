import edu.princeton.cs.algs4.StdIn;

public class Factorial {

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int value = StdIn.readInt();
        int return_value = factorial(value);
        System.out.println("return_value = " +  return_value);
    }

    public static int factorial(int value){
        System.out.println("Entering: n = " + value);
        if(value == 0 || value == 1){
            System.out.println("Returning 1");
            return 1;
        } else {
            int temp = value * factorial(value - 1);
            System.out.println("Returning " + temp);
            return temp;
        }
    }
}
