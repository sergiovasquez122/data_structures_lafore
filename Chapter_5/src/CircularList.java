/**
 * Exercise 5.3 Implement a Circular linked list
 */
public class CircularList {
    private class Node{
        private int data;
        private Node next;
    }

    Node head;
    public Node current(){
        return head;
    }

    public Node next(){
        head = head.next;
        return head;
    }

    public void insert(int value){
        Node newNode = new Node();
        if(head == null) head = newNode;
        newNode.data = value;
        newNode.next = head.next;
        head.next = newNode;
    }

    void display(){
        Node current = head;
        do{
            System.out.print(current.data + " ");
            current = current.next;
        } while(current != head);
    }

    public static void main(String[] args) {
        CircularList circularList = new CircularList();
        circularList.insert(2);
        circularList.display();
    }
}
