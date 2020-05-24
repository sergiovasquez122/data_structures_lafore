public class Queue {
    private Link first;
    private Link last;
    private int size;

    public Queue(){
        first = null;
        last = null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void push(int intValue, double Value){
        Link newNode = new Link(2, 2.99);
        if(first == null){
            first = last = newNode;
        } else {
            last.next = newNode;
        }
    }

    public void displayList(){
        for(Link current = first;current != null;current = current.next){
            current.displayLink();
        }
        System.out.println();
    }

    public double delete(){
        double value = first.dData;
        first = first.next;
        return value;
    }
}
