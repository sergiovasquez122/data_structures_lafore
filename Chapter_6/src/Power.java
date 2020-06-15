import edu.princeton.cs.algs4.StdIn;

public class Power {
    public static void main(String[] args) {
        System.out.print("Enter a number x: ");
        int x = StdIn.readInt();
        System.out.print("Enter a number y: ");
        int y = StdIn.readInt();
        System.out.println(pow(x, y));
    }

    public static int pow(int x, int y){
        if(y == 1){
            return x;
        } else {
            int temp = y % 2 == 0 ? pow(x * x, y / 2) : x * pow(x * x , y / 2);
            return temp;
        }
    }
}
