import edu.princeton.cs.algs4.StdIn;

public class StackTriangleApp {
    static int theNumber;
    static int theAnswer;
    static StackX theStack;
    static int codePart;
    static Params theseParams;

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        theNumber = StdIn.readInt();
        System.out.println("Triangle=" + theAnswer);
    }

    public static void recTriangle(){
        theStack = new StackX(10000);
        codePart = 1;
    }

    public static boolean step(){
        switch (codePart){
            case 1:
                theseParams = new Params(theNumber, 6);
                theStack.push(theseParams);
                codePart = 2;
                break;
            case 2:
               theseParams = theStack.peek();
               if(theseParams.n == 1){
                   theAnswer = 1;
                   codePart = 5; // exit
               }
               break;
            case 3:
                Params newParams = new Params(theseParams.n - 1, 4);
                theStack.push(newParams);
                codePart = 2;
                break;
            case 4:
                theseParams = theStack.peek();
                theAnswer = theAnswer + theseParams.n;
                codePart = 5;
                break;
            case 5:
                theseParams = theStack.peek();
                codePart = theseParams.returnAddress;
                theStack.pop();
                break;
            case 6:
                return true;

        }
        return false;
    }
}
