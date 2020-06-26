/**
 * 12.4 implement a Max Priority Queue using a BST
 */
public class BST<Key extends Comparable<Key>>{
    private Node root;

    private class Node{
        private Key key;
        private Node left, right;
        int N;
        Node(Key key, Node left, Node right, int N){
            this.key = key;
            this.left = left;
            this.right = right;
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

    }

}
