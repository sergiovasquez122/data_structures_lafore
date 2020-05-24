public class SortedLIst {
    private class Node{
        private long data;
        private Node next;

        public Node(long data){
            this.data = data;
        }

        public void displayLink(){
            System.out.print(data + " ");
        }
    }


    private Node first;

    public SortedLIst(){}

    public boolean isEmpty(){
        return first == null;
    }

    public void insert(long value){
        Node newNode = new Node(value);
        Node previous = null;
        Node current = first;
        while(current != null && value > current.data){
            previous = current;
            current = current.next;
        }
        if(previous == null){
            first = newNode;
        } else {
            previous.next = newNode;
        }
        newNode.next = current;
    }

    public Node remove(){
        Node temp = first;
        first = temp.next;
        return temp;
    }

    public void displayList(){
        System.out.print("List (first -> last): ");
        Node current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
