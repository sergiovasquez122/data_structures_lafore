
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
        long min_value = Long.MAX_VALUE;
        int index = 0;
        for(int i = 0;i < n_items;++i){
            if(min_value > queue_array[i]){
                index = i;
                min_value = queue_array[i];
            }
        }

        for(int k = index;k < n_items - 1;++k){
            queue_array[k] = queue_array[k + 1];
        }
        n_items--;
        return min_value;
    }

    public boolean isEmpty(){
        return n_items == 0;
    }

    public int size(){
        return n_items;
    }

    public boolean full(){
        return n_items == max_size;
    }

    public void clear(){
        n_items = 0;
    }

    public void display(){
        for(long l : queue_array){
            System.out.print(l + " ");
        }
        System.out.println();
    }
}
