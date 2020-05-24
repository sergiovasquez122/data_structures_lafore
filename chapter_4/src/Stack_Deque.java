/**
 * Exercise 4.3 write a program that implements a stack class that is based
 * on the deque class in programming Project 4.2
 */
public class Stack_Deque {
    private Deque deque;

    public Stack_Deque(int s){
        deque = new Deque(s);
    }

    public void push(int value){
        deque.insertLeft(value);
    }

    public int pop(){
        return deque.removeLeft();
    }

    public int size(){
        return deque.size();
    }

    public boolean isEmpty(){
        return deque.isEmpty();
    }

    public boolean isFull(){
        return deque.isFull();
    }

}
