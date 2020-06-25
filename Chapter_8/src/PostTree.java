import edu.princeton.cs.algs4.Stack;

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
                Node C = trees.pop();
                Node B = trees.pop();
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
}
