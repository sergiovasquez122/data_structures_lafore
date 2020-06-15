import edu.princeton.cs.algs4.StdIn;

public class Power {
    public static void main(String[] args) {
        System.out.print("Enter a number x: ");
        int x = StdIn.readInt();
        System.out.print("Enter a number y: ");
        int y = StdIn.readInt();
    }

    public static int pow(int x, int y){
        System.out.println("x=" + x + ", y="+y);

        System.out.println("Returning " + x + " x=" + x + ", y=" + y);
        return 0;
    }
}
