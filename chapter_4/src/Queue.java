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
            rear = -1;
        }
        queue_array[++rear] = value;
        ++n_items;
    }

    public long remove(){
        long return_value = queue_array[front++];
        if(front == max_size)
            front = 0;
        n_items--;
        return return_value;
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

    public long peek_front(){
        return queue_array[front];
    }

    /**
     * Exercise 4.1 Write a method
     * to display the content of the queue as it
     * was inserted
     */
    public void display(){
        for(int i = 0;i < n_items;++i){
            System.out.print(queue_array[(i + front) % max_size] + " ");
        }
        System.out.println();
    }
}
