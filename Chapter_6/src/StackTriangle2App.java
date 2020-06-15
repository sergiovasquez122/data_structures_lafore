import edu.princeton.cs.algs4.StdIn;

public class StackTriangle2App {
    static int theNumber;
    static int theAnswer;
    static StackX theStack;

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        theNumber = StdIn.readInt();
        stackTriangle();
        System.out.println("Triangle="+theAnswer);
    }

    public static void stackTriangle(){
        theStack = new StackX(10000);

        theAnswer = 0;
        while(theNumber > 0){
            theStack.push(new Params(theNumber, 0));
            --theNumber;
        }
        while(!theStack.isEmpty()){
            int newN = theStack.pop().n;
            theAnswer += newN;
        }
    }
}
