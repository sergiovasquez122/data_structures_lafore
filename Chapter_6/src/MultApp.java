import edu.princeton.cs.algs4.StdIn;

public class MultApp {
    public static void main(String[] args) {
        System.out.print("Enter a number x: ");
        int x = StdIn.readInt();
        System.out.print("Enter a number y: ");
        int y = StdIn.readInt();
        int return_value = mult(x, y);
        System.out.println("Return value "+ return_value);
    }

    public static int mult(int x, int y){
        System.out.println("Entering x = " + x + ", y=" + y);
        if(y == 1){
            return x;
        }else{
            int temp = x + mult(x, y - 1);
            System.out.println("returning temp="+ temp);
            return temp;
        }
    }
}
