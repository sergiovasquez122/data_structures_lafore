import org.omg.CORBA.NO_IMPLEMENT;

/**
 * Exercise 5.2
 * Implement a deque based on a doubly linked list
 */
public class Deque {

    private Node head;
    private Node tail;
    private int size;

    public Deque(){
        head = tail = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insertFront(int value){
        Node newHead = new Node();
        newHead.value = value;
        if( isEmpty() ){
            head = tail = newHead;
        } else{
            newHead.next = head;
            head.prev = newHead;
            head = newHead;
        }
    }

    public void insertBack(int value){
        Node newTail = new Node();
        newTail.value = value;
        if( isEmpty() ){
            head = tail = newTail;
        } else {
            newTail.prev = tail;
            tail.next = newTail;
            tail = newTail;
        }
    }

    public int removeFront(){
        int value = head.value;
        head = head.next;
        return value;
    }

    public int removeBack(){
        int value = tail.value;
        tail = tail.prev;
        return value;
    }

    private class Node{
        private Node next;
        private Node prev;
        private int value;
    }
}
