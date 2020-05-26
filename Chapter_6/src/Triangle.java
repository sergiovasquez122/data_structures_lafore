import edu.princeton.cs.algs4.StdIn;

public class Triangle {
    static int theNumber;
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        theNumber = StdIn.readInt();
        int theAnswer = triangle(theNumber);
        System.out.println("Triangle = " + theAnswer);
    }

    public static int triangle(int n){
        System.out.println("Entering: n = " + n);
        if(n == 1)
        {
            System.out.println("Returning 1");
            return 1;
        }
        else {
            int temp = n + triangle(n - 1);
            System.out.println("Returning " + temp);
            return temp;
        }
    }

}
