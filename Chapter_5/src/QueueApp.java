public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue();

        theQueue.push(44,.22);
        theQueue.push(66, .1);
        theQueue.push(99, .3);
        theQueue.push(77, .2);

        theQueue.displayList();
        theQueue.delete();
        theQueue.delete();
        theQueue.displayList();
    }
}
