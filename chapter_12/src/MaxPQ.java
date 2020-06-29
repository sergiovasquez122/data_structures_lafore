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
    }

    public static void main(String[] args) {

    }

}
