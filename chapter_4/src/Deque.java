import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Exercise 4.2 Create a double ended-queue that
 * supports wrap-arounds
 */
public class Deque {

    private int deque_array[];
    private int n_elems;
    private int max_size;
    private int head;
    private int tail;

    public Deque(int s){
        n_elems = 0;
        max_size = s;
        deque_array = new int[max_size];
        head = 0;
        tail = deque_array.length - 1;
    }

    public void insertLeft(int value){
        deque_array[tail--] = value;
        if(tail == 0)  tail = deque_array.length -1;
        n_elems++;
    }

    public void insertRight(int value){
        deque_array[head++] = value;
        if(head ==  deque_array.length) head = 0;
        n_elems++;
    }

    public int removeLeft(){
        if(head == deque_array.length - 1) head = -1;
        return deque_array[++head];
    }

    public int removeRight(){
        if(tail == 0) tail = deque_array.length - 1;
        return deque_array[--tail];
    }

    public boolean isEmpty(){
        return n_elems == 0;
    }

    public boolean isFull(){
        return n_elems == max_size;
    }

    public int size(){
        return n_elems;
    }
}
