/**
 * 12.4 implement a Max Priority Queue using a BST
 */
public class BST<Key extends Comparable<Key>>{
    private Node root;

    private class Node{
        private Key key;
        private Node left, right;
        int N;
        Node(Key key, int N){
            this.key = key;
            this.N = N;
        }
    }

    public int size(){
        return size(root);
    }

    private int size(Node x){
        if(x == null){
            return 0;
        }
        return x.N;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(Key key){
        root = insert(root, key);
    }

    private Node insert(Node x, Key key){
        if(x == null) return new Node(key, 1);
        int cmp = key.compareTo(x.key);
        if(cmp < 0) x.left = insert(x.left, key);
        else if(cmp > 0) x.right = insert(x.right, key);
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }

    public Key max(){
        Node x = max(root);
        return x != null ? x.key : null;
    }

    private Node max(Node x){
        if(x.right != null) return max(x.right);
        return x;
    }
}
