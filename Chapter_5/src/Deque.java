/**
 * Exercise 5.2
 * Implement a deque based on a doubly linked list
 */
public class Deque {

    private Node head;
    private Node tail;
    int size;

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

    }

    public void insertBack(int value){

    }

    public void removeFront(){

    }

    public void removeBack(){

    }

    private class Node{
        private Node next;
        private int value;
    }
}
