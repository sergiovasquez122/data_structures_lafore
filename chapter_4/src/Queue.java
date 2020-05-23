public class Queue {
    private int max_size;
    private long[] queue_array;
    private int front;
    private int rear;
    private int n_items;

    public Queue(int s){
        max_size = s;
        queue_array = new long[max_size];
        front = 0;
        rear = -1;
        n_items = 0;
    }

    public void insert(long value){
        if( rear == max_size - 1 ){
            rear = 0;
        }
        queue_array[rear++] = value;
        ++n_items;
    }

    public long remove(){

    }

    public int size(){
        return n_items;
    }

    public boolean isEmpty(){
        return n_items == 0;
    }

    public boolean isFull(){
       return n_items == max_size;
    }
}
