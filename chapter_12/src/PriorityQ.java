/**
 * Programming exercise 12.3
 * Implement the PriorityQ class using the maxHeap data structure
 */
public class PriorityQ {

    private MaxPQ<Integer> maxPQ;
    private int maxSize;

    public PriorityQ(int s){
        maxPQ = new MaxPQ<>(s);
        maxSize = s;
    }

    public void insert(int item){
        maxPQ.insert(item);
    }

    public int remove(){
        return maxPQ.delMax();
    }

    public int peekMax(){
        return maxPQ.peek();
    }

    public boolean isFull(){
        return maxPQ.size() == maxSize;
    }

    public boolean isEmpty(){
        return maxPQ.isEmpty();
    }

    public static void main(String[] args) {
        PriorityQ thePQ = new PriorityQ(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);

        while(!thePQ.isEmpty()){
            int item = thePQ.remove();
            System.out.print(item + " ");
        }
        System.out.println(" ");
    }
}
