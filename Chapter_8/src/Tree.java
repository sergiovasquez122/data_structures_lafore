import edu.princeton.cs.algs4.Stack;

public class Tree {
    private Node root;

    public Node find(int key){
        Node current = root;
        while(current != null){
            if(current.iData < key){
                current = current.right;
            } else if(current.iData > key){
                return current.left;
            } else {
                return current;
            }
        }
        return null;
    }

    public void insert(int id, double dd){
        root = insert(root, id, dd);
    }

    private Node insert(Node current, int id, double dd){
        if(current == null){
            current = new Node();
            current.iData = id;
            current.dData = dd;
            return current;
        }

        if(current.iData < id) current.right = insert(current.right, id, dd);
        else if(current.iData > id) current.left = insert(current.left, id, dd);
        return current;
    }

    private void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.println(root);
        inOrder(root.right);

    }

}
