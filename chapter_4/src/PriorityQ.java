public class PriorityQ {
    private int max_size;
    private long[] queue_array;
    private int n_items;

    public PriorityQ(int s){
        max_size = s;
        queue_array = new long[max_size];
        n_items = 0;
    }

    public void insert(long item){
        queue_array[n_items++] = item;

        int i = n_items - 1;
        while(i > 0 && queue_array[i -1] >= item){
            queue_array[i] = queue_array[i-1];
            --i;
        }
        queue_array[i] = item;
    }

    public long peekMin(){
        return queue_array[n_items - 1];
    }

    public boolean isEmpty(){
        return n_items == 0;
    }

    public boolean isFull(){
        return n_items == max_size;
    }
}
