import edu.princeton.cs.algs4.SequentialSearchST;

import java.util.Hashtable;

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
        return (key & 0x7fffffff) % M;
    }

    private void resize(int cap){
        HashTableChaining t = new HashTableChaining(cap);
        for(int i = 0;i < M;++i) {
            for (int k : st[i].keys()){
                t.put(k, st[i].get(k));
            }
        }
    }

    public int get(int key){
        return st[hash(key)].get(key);
    }

    public void put(int key, int val){
        st[hash(key)].put(key, val);
        N++;
    }
}
