import edu.princeton.cs.algs4.StdIn;

public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N;

    MaxPQ(int max){
        pq = (Key[]) new Comparable[max + 1];
        N = 0;
    }

    void insert(Key v){
        pq[++N] = v;
        swim(N);
    }

    Key delMax(){
        Key key = pq[1];
        exch(1, N--);
        pq[N + 1] = null;
        sink(1);
        return key;
    }

    boolean isEmpty(){
        return N == 0;
    }

    int size(){
        return N;
    }

    private boolean less(int i, int j){
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void exch(int i, int j){
        Key t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    private void swim(int k){
        while(k > 1 && less(k / 2, k)){
            exch(k / 2, k);
            k = k / 2;
        }
    }

    private void sink(int k){
        while(2 * k <= N){
            int idx = 2 * k;
            if(idx + 1 < N && less(idx, idx + 1)) idx++;
            if(!less(k, idx)) break;
            exch(k, idx);
            k = idx;
        }
    }

    public static void main(String[] args) {

    }

}
