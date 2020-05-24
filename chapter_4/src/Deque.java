import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Exercise 4.2 Create a double ended-queue that
 * supports wrap-arounds
 */
public class Deque {

    private int deque_array[];
    private int n_elems;
    private int max_size;
    private int front;
    private int rear;

    public Deque(int s){

    }

    public void insertLeft(int value){

    }

    public void insertRight(int value){

    }

    public int removeLeft(){
        throw new NotImplementedException();
    }

    public int removeRight(){
        throw new NotImplementedException();
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
