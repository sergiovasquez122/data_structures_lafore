import edu.princeton.cs.algs4.Stack;

/**
 * Make a complete tree that is composed of characters
 */
public class exercise_8_3_app {

    private Node root;

    private class Node {
        char data;
        Node left, right;
        Node(char data){
            this.data = data;
        }
    }

    public exercise_8_3_app(String input){
        helper(input);
    }

    private void helper(String input){
        input = " " + input;
        root = helper(1, input);
    }

    private Node helper(int n, String input){
        if(n >= input.length()){
            return null;
        }
        Node newNode = new Node(input.charAt(n));
        newNode.left = helper(2 * n, input);
        newNode.right = helper(2* n + 1, input);
        return newNode;
    }

    public void displayTree(){
        Stack<Node> globalStack = new Stack<>();
        globalStack.push(root);
        int nBlanks = 32;
        boolean isRowEmpty = false;
        System.out.println("......................................................");
        while(!globalStack.isEmpty()){
            Stack<Node> localStack = new Stack<>();
            isRowEmpty = true;
            for(int j = 0;j < nBlanks;++j){
                System.out.print(' ');
            }

            while(!globalStack.isEmpty()){
                Node temp = globalStack.pop();
                if(temp != null){
                    System.out.print(temp.data);
                    if(temp.left != null) localStack.push(temp.left);
                    if(temp.right != null) localStack.push(temp.right);
                    isRowEmpty = !(temp.left != null || temp.right != null);
                }
                for(int j = 0;j < nBlanks * 2 - 2;++j) {
                    System.out.print(' ');
                }
            }
            System.out.println();
            nBlanks /= 2;
            while(!localStack.isEmpty()) {
                globalStack.push(localStack.pop());
            }
        }
        System.out.println("......................................................");
    }

    private void helper(Node root){
        if(root == null){
            return;
        }
        helper(root.left);
        System.out.print(root.data);
        helper(root.right);
    }
    public static void main(String[] args) {
        exercise_8_3_app tree = new exercise_8_3_app("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        tree.displayTree();
    }
}
