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

    public int hash(int key){
        return (key & 0x7fffffff) % M;
    }

    public void put(int key, int value){
        table[hash(key)].put(key, value);
        N++;
        if(N == M) resize(2 * M);
    }

    public int get(int key){
        Integer value = table[hash(key)].get(key);
        return value == null ? -1 : value;
    }

    public int remove(int key){
        Integer value = table[hash(key)].get(key);
        table[hash(key)].get(key);
        N--;
        if(N > 0 && N == M / 4) resize(M / 2);
        return value == null ? -1 : value;
    }

    private void resize(int cap){
        HashTableBST temp = new HashTableBST(cap);
        for(int i = 0;i < M;++i)
            for(Integer key : table[i].keys())
                temp.put(key, table[i].get(key));
        this.M = temp.M;
        this.N = temp.N;
        this.table = temp.table;
    }
}
