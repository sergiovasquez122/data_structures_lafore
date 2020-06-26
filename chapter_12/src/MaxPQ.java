public class MaxPQ<Key extends Comparable<Key>> {
    Key[] pq;
    MaxPQ(){

    }

    MaxPQ(int max){

    }

    MaxPQ(Key[] a){

    }

    void insert(Key v){

    }

    Key delMax(){

    }

    boolean isEmpty(){

    }

    int size(){

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
}
