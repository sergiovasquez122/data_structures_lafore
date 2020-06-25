import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

public class PostTree {

    private class Node{
        Node left, right;
        char data;

        Node(char data){
           this.data = data;
        }
    }

    private Node root;

    public PostTree(String post_fix){
        Stack<Node> trees = new Stack<>();
        for(int i = 0;i < post_fix.length();++i){
            if(Character.isDigit(post_fix.charAt(i))){
                trees.push(new Node(post_fix.charAt(i)));
            } else {
                Node B = trees.pop();
                Node C = trees.pop();
                Node A = new Node(post_fix.charAt(i));
                A.left = C;
                A.right = B;
                trees.push(A);
            }
        }
        root = trees.pop();
    }

    private void inorder(Node root){
        if(root == null){
            return;
        }

        System.out.print("(");
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
        System.out.print(")");
    }

    private void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    private void postorder(Node root){
        if(root == null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data);
    }

    public void traverse(int traverseType){
        switch (traverseType){
            case 1: System.out.println("\nPreorder traversal: ");
                preorder(root);
                break;
            case 2: System.out.print("\nInorder traversal: ");
                inorder(root);
                break;
            case 3: System.out.println("\nPostorder traversal: ");
                postorder(root);
                break;
        }
        System.out.println();
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
        System.out.print("Enter postfix: ");
        String input = StdIn.readLine();
        PostTree postTree = new PostTree(input);
        postTree.traverse(1);
        postTree.traverse(2);
        postTree.traverse(3);
        postTree.displayTree();
    }
}
