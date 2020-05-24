import edu.princeton.cs.algs4.StdRandom;

public class exercise4_3 {
    public static void main(String[] args) {
        int max_size = 10;
        PQ pq = new PQ(max_size);
        for(int i = 0;i < max_size;++i){
            pq.insert(StdRandom.uniform(0, 10));
        }
        pq.display();
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
