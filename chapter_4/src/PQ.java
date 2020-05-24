
/**
 * Exercise 4.4 Write a program with a Priority Queue that has fast O(1) insertion time but slower
 * removal of the higher priority item
 */
public class PQ {
    private int max_size;
    private int n_items;
    private long[] queue_array;

    public PQ(int s){
        max_size = s;
        queue_array = new long[max_size];
        n_items = 0;
    }

    public long peek(){
        long min_value = Long.MAX_VALUE;
        for(int i = 0;i < n_items;++i){
            min_value = Long.min(min_value, queue_array[i]);
        }
        return min_value;
    }

    public void insert(long value){
        queue_array[n_items++] = value;
    }

    public long remove(){

    }

    public boolean isEmpty(){
        return n_items == 0;
    }

    public int size(){
        return n_items;
    }

    public void clear(){
        n_items = 0;
    }
}
