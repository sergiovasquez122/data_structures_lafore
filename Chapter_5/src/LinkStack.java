public class LinkStack {
    private class Node{
        private long data;
        private Node next;

        public Node(long dd){
            data = dd;
        }

        private void displayLink(){
            System.out.print(data + " ");
        }
    }

    private Node head;

    public boolean isEmpty(){
        return head == null;
    }

    public void insert(long value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public long delete(){
        long value = head.data;
        head = head.next;
        return value;
    }

    public void displayList(){
        Node current = head;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
