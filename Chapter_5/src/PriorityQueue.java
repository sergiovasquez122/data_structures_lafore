/**
 * exercise 5.1
 * Implement a priority queue based on a sorted linked list. The
 * remove operation should remove the item with the smallest key
 */
public class PriorityQueue {
    private class Node {
        private int data;
        private Node next;
    }

    private Node head;
    private int size;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void insert(int value){
        Node newNode = new Node();
        newNode.data = value;

        Node current = head;
        Node previous = null;
        while(current != null && value > current.data){
            previous = current;
            current = current.next;
        }

    }

    public int delete(){
        int value = head.data;
        head = head.next;
        return value;
    }
}
