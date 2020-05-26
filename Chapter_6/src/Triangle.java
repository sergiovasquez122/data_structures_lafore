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
        if(n == 1) return 1;
        else return n + triangle(n - 1);
    }

}
