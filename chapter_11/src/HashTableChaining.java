import edu.princeton.cs.algs4.SequentialSearchST;

public class HashTableChaining {

    private int N;
    private int M = 16;
    SequentialSearchST<Integer,Integer>[] st;

    public HashTableChaining(){
        this(16);
    }

    public HashTableChaining(int M){
        this.M = M;
        st = (SequentialSearchST<Integer,Integer>[]) new SequentialSearchST[M];
        for(int i = 0;i < M;++i)
            st[i] = new SequentialSearchST<>();
    }

    public int hash(int key){
        return key % M;
    }

    public int get(int key){
        return st[hash(key)].get(key);
    }

    public void put(int key, int val){
        st[hash(key)].put(key, val);
    }
}
