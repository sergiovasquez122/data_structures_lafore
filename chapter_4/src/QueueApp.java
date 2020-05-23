public class QueueApp {
    public static void main(String[] args) {
        Queue the_queue = new Queue(5);

        the_queue.insert(10);
        the_queue.insert(20);
        the_queue.insert(30);
        the_queue.insert(40);

        the_queue.remove();
        the_queue.remove();
        the_queue.remove();

        the_queue.insert(50);
        the_queue.insert(60);
        the_queue.insert(70);
        the_queue.insert(80);

        while( !the_queue.isEmpty() ){
            long n = the_queue.remove();
            System.out.print(n);
            System.out.println(" ");
        }
        System.out.println("");
    }
}
