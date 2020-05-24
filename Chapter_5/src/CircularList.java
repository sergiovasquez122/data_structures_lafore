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

    public int current(){
        return head.data;
    }

    public void next(){
        head = head.next;
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
        if(head.next == head)
        {
            head = null;
        } else{
            Node current = head.next;
            while (current.next != head) {
                current = current.next;
            }
            current.next = head.next;
            head = current.next;
        }
        return value;
    }

    void display(){
        Node current = head;
        if(current == null) return;
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

        circularList.next();
        circularList.display();
        circularList.next();
        circularList.display();

        circularList = new CircularList();
        for(int i = 0;i < 10;++i){
            circularList.insert(i);
        }
        circularList.display();
        circularList.next();
        circularList.display();
        circularList.delete();
        circularList.display();

        circularList.delete();
        circularList.display();
        while(!circularList.isEmpty()){
            circularList.delete();
            circularList.display();
        }
    }
}
