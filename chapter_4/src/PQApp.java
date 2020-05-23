import edu.princeton.cs.algs4.StdRandom;

public class PQApp {
    public static void main(String[] args) {
        int max_size = 10;
        PriorityQ pq = new PriorityQ(max_size);

        for(int i = 0; i < max_size; ++i){
            pq.insert(StdRandom.uniform(0,50));
        }

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }

        pq.insert(7);
        pq.insert(8);
        pq.insert(6);
        pq.insert(10);
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
