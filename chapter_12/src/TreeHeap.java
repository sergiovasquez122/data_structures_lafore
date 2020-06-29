/**
 * 12.5 Write a heap using a binary tree structure.
 */
public class TreeHeap {
    private Node root;
    private int N;

    int size(){
        return N;
    }

    boolean isEmpty(){
        return N == 0;
    }

    public void insert(int val){

    }

    public int deleteMax(){
        return 0;
    }

    private class Node{
        Node parent, left, right;
        int val;
    }
}
