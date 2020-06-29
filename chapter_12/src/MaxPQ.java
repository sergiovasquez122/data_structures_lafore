/**
 * Programming exercise 12.2
 * Write a toss method that places a new node in the heap
 * without attempting to preserve the Max-heap invariant. Then write
 * a restore method that restores the heap condition through out the entire heap.
 */
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

    Key peek(){
        return pq[1];
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
        MaxPQ<Integer> maxPQ = new MaxPQ<>(32);

        maxPQ.insert(70);
        maxPQ.insert(40);
        maxPQ.insert(50);
        maxPQ.insert(20);
        maxPQ.insert(60);
        maxPQ.insert(100);
        maxPQ.insert(80);
        maxPQ.insert(30);
        maxPQ.insert(10);
        maxPQ.insert(90);

        while(!maxPQ.isEmpty()){
            System.out.println(maxPQ.delMax());
        }
    }

}
