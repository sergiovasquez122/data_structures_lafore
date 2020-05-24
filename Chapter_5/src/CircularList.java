/**
 * Exercise 5.3 Implement a Circular linked list
 */
public class CircularList {
    private class Node{
        private int data;
        private Node next;
    }

    private Node head;
    private int size;

    public Node current(){
        return head;
    }

    public Node next(){
        head = head.next;
        return head;
    }

    public int size(){
        return size;
    }

    public void insert(int value){
        Node newNode = new Node();
        newNode.data = value;
        if(head == null){
            head = newNode;
            head.next = head;
        } else {
            newNode.next = head.next;
            head.next = newNode;
        }
    }

    public int delete(){
        int value = head.data;
        if(head.next == head) head = null;
        Node current = head.next;
        while(current.next != head){
            current = current.next;
        }
        current.next = head.next;
        return value;
    }

    void display(){
        Node current = head;
        do{
            System.out.print(current.data + " ");
            current = current.next;
        } while(current != head);
        System.out.println();
    }

    public boolean isEmpty(){
        return head == null;
    }

    public static void main(String[] args) {
        CircularList circularList = new CircularList();
        circularList.insert(2);
        circularList.display();

        circularList.insert(3);
        circularList.display();
    }
}
