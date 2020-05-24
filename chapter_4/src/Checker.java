import java.util.Random;

/**
 * exercise 4.5
 * Write a program that models checkout lines ata supermaker
 * using the Queue class
 */
public class Checker {
    private Queue queue;
    private int processing_time;
    private int start_time;
    private Random random;

    public Checker(int max_length){
        queue = new Queue(max_length);
        start_time = -1;
        processing_time = -1;
        random = new Random();
    }

    public void display(){
        queue.display();
    }

    public void addToLine(int time, long customer){
        queue.insert(customer);

        if(queue.size() == 1)
            setTime(time);
    }


    public void updateLine(int time) {

        // Check if line is not empty

        if (!queue.isEmpty()) {

            // Find time elapsed after the current customer arrived at the

            // checker

            int timeElapsed = (time - this.start_time);

            // Check if the current customer is billed

            if (timeElapsed == this.processing_time) {

                // Remove the customer from the queue

                queue.remove();

                // Reset start time and processing time

                start_time = -1;

                processing_time = -1;

                if (!queue.isEmpty())

                    setTime(time);

            }

        }

    }

    public int waitingTime(int time){
        if(queue.isEmpty()) return 0;
        else if(queue.isFull()) return -1;
        else {
            int elapsed_time = (time - this.start_time);
            int time_for_customer = this.processing_time - elapsed_time;
            int timeForRemainingCustomer = ((queue.size() - 1) * this.processing_time);

            return time_for_customer + timeForRemainingCustomer;
        }
    }

    public void setTime(int time){
        start_time = time;
        processing_time = random.nextInt(10) + 1;
    }
}
