import edu.princeton.cs.algs4.Queue;

import java.util.Scanner;

/**
 * exercise 5.5 solve the Josephus problem
 */
public class Josephus {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int people_count, count_off, counter = 0;
        System.out.print("Enter number of people: ");
        people_count = in.nextInt();
        System.out.print("Enter countoff: ");
        count_off = in.nextInt();
        Queue<Integer> queue = new Queue<>();

        for(int i = 1; i <= people_count;++i){
            queue.enqueue(i);
        }

        while(queue.size() != 1){
            while(counter++ != count_off){
                int item = queue.dequeue();
                queue.enqueue(item);
            }
            counter = 0;
            queue.dequeue();
        }
        System.out.println("Surviving person is: " + queue.peek());
    }
}
