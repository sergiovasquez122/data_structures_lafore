import edu.princeton.cs.algs4.Stack;

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
        String bitString = Integer.toBinaryString(N + 1);
        root = insert(root, bitString, 1, val);
        N++;
    }

    public Node insert(Node x, String bitString,int idx, int val){
        if(x == null) {
            return new Node(val);
        }
        if(bitString.length() == idx){
            x.val = val;
        } else if(bitString.charAt(idx) == '0') {
            Node left = insert(x.left, bitString, idx + 1, val);
            x.left = left;
            left.parent = x;
            swim(left);
        } else {
            Node right = insert(x.right, bitString, idx + 1, val);
            x.right = right;
            right.parent = x ;
            swim(right);
        }
        return x;
    }

    public int deleteMax(){
        return 0;
    }

    private class Node{
        Node parent, left, right;
        int val;
        Node(int val){this.val = val;}
    }

    public Node rightmostNode(){
        String bitString = Integer.toBinaryString(N);
        int idx = 1;
        Node iter = root;
        while(idx != bitString.length()){
            iter = bitString.charAt(idx) == '0' ? iter.left : iter.right;
            idx++;
        }
        return iter;
    }

    public void swim(Node x){
        while(x.parent != null && x.parent.val < x.val){
            int t = x.parent.val;
            x.parent.val = x.val;
            x.val = t;
            x = x.parent;
        }
    }

    public void sink(Node x){
        while(x.left != null){
            Node swapNode = x.left;
            if(x.right != null && swapNode.val < x.right.val) swapNode = x.right;
            if(swapNode.val < x.val) break;
            int t = x.val;
            x.val = swapNode.val;
            swapNode.val = t;
            x = swapNode;
        }
    }

    public void displayHeap(){
        System.out.println("TreeHeap: ");
        Stack<Node> globalStack = new Stack<>();
        globalStack.push(root);
        int blanks = 32;
        boolean isRowEmpty = false;
        System.out.println("...................................................................");

        while(!isRowEmpty){
            Stack<Node> localStack = new Stack<>();
            isRowEmpty = true;
            for(int j = 0;j < blanks;++j)
                System.out.print(" ");

            while(!globalStack.isEmpty()){
                Node temp = globalStack.pop();
                if(temp != null){
                    System.out.print(temp.val);
                    localStack.push(temp.left);
                    localStack.push(temp.right);
                    isRowEmpty = !(temp.left != null || temp.right != null);
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for(int i= 0;i < blanks * 2 - 2;++i)
                    System.out.print(' ');
            }
            System.out.println();
            blanks /= 2;
            while(!localStack.isEmpty()) globalStack.push(localStack.pop());
        }
        System.out.println("...................................................................");
    }


    public static void main(String[] args) {
        TreeHeap treeHeap = new TreeHeap();
        treeHeap.insert(0);
        treeHeap.insert(1);
        treeHeap.insert(2);
        treeHeap.insert(3);
        treeHeap.insert(4);
        treeHeap.insert(5);
        treeHeap.insert(6);
        treeHeap.insert(7);
        treeHeap.insert(8);
        treeHeap.insert(9);
        treeHeap.insert(10);
        treeHeap.insert(11);
        treeHeap.insert(12);
        treeHeap.insert(13);
        treeHeap.insert(14);
        treeHeap.displayHeap();
        System.out.println(treeHeap.rightmostNode().val);
        treeHeap.sink(treeHeap.root);
        treeHeap.displayHeap();
    }
}
