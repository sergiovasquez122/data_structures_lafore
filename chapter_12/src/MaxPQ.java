import edu.princeton.cs.algs4.StdIn;

public class MaxPQ<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N;

    MaxPQ(int max){
        pq = (Key[]) new Comparable[max];
        N = 0;
    }

    void insert(Key v){
        pq[N++] = v;
        swim(N);
    }

    Key delMax(){
        Key max = pq[0];
        exch(0, N--);
        pq[N + 1] = null;
        sink(0);
        return max;
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
        while(k > 0 && less((k - 1)/ 2, k)){
            exch((k - 1) / 2, k);
            k = (k - 1) / 2;
        }
    }

    private void sink(int k){
        while(2 * k + 1 <= N){
            int j = 2 * k + 1;
            if(j < N && less(j, j + 1)) j++;
            if(!less(k, j)) break;
            exch(k, j);
            k = j;
        }
    }

    public static void main(String[] args) {
        MaxPQ<Integer> pq = new MaxPQ<>(31);

        pq.insert(70);
        pq.insert(40);
        pq.insert(60);
        pq.insert(20);
        pq.insert(60);
        pq.insert(100);
        pq.insert(80);
        pq.insert(90);
        pq.insert(10);
        pq.insert(90);

    }

}
