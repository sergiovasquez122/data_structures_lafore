import edu.princeton.cs.algs4.RedBlackBST;

/**
 * Implement a separate-chaining hash-table using a balanced binary search tree
 */
public class HashTableBST {
    private RedBlackBST<Integer,Integer> table[];
    private int M;
    private int N;

    public HashTableBST(){
        this(16);
    }

    public HashTableBST(int M){
        this.M = M;
        this.N = 0;
        table = (RedBlackBST<Integer, Integer>[]) new RedBlackBST[M];
        for(int i = 0;i < M;++i)
            table[i] = new RedBlackBST<>();
    }



}
