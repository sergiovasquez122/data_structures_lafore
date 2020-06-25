import edu.princeton.cs.algs4.StdIn;

/**
 * Expand on programming exercise 8_1
 * and create a balanced tree
 */
public class exercise_8_2_app {
    public static void main(String[] args) {
        // reusing the solution for exercises 8_1 because the solution for 8_1
        // created a balanced tree
        System.out.print("Enter a string with all alphabetical letters: ");
        String input = StdIn.readLine();
        exercise_8_1_app tree = new exercise_8_1_app(input);
        tree.displayTree();
    }
}
