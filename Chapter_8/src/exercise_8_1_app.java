import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

/**
 * exercise 8.1 Modify the tree program
 * to create a binary tree from a string of letters.
 * Construct the tree so that all the nodes that contain letters are leaves
 */
public class exercise_8_1_app {

    Node root;

    private class Node{
        Node left, right;
        char data;
        Node(char data){
            this.data = data;
        }
    }

    public exercise_8_1_app(String input){
        Queue<Node> nodes = new Queue<>();
        for(int i = 0;i < input.length();++i){
            nodes.enqueue(new Node(input.charAt(i)));
        }

        while(nodes.size() != 1){
            Node A = nodes.dequeue();
            Node B = nodes.dequeue();
            Node plus_node = new Node('+');
            plus_node.left = A;
            plus_node.right = B;
            nodes.enqueue(plus_node);
        }
        root = nodes.dequeue();
    }

    public void displayTree(){
        Stack<Node> globalStack = new Stack<>();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("......................................................");
        while(!isRowEmpty){
            Stack<Node> localStack = new Stack<>();
            isRowEmpty = true;
            for(int j = 0;j < nBlanks;++j){
                System.out.print(' ');
            }

            while(!globalStack.isEmpty()){
                Node temp = globalStack.pop();
                if(temp != null){
                    System.out.print(temp.data);
                    localStack.push(temp.left);
                    localStack.push(temp.right);
                    isRowEmpty = !(temp.left != null || temp.right != null);
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int j = 0;j < nBlanks * 2 - 2;++j)
                    System.out.print(' ');
            }
            System.out.println();
            nBlanks /= 2;
            while(!localStack.isEmpty()) globalStack.push(localStack.pop());
        }
        System.out.println("......................................................");
    }

    public static void main(String[] args) {
        System.out.print("Enter a string with all alphabetical letters: ");
        String input = StdIn.readLine();
        exercise_8_1_app tree = new exercise_8_1_app(input);
        tree.displayTree();
    }
}

/*
Enter a string with all alphabetical letters: ABCDE
......................................................
                                +
                +                              +
        C              D              E              +
    --      --      --      --      --      --      A      B
......................................................
 */
