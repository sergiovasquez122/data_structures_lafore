import edu.princeton.cs.algs4.StdRandom;

/**
 * Client to test merge method
 */
public class exercise_2_5 {
    public static void main(String[] args) {
        OrdArray lhs = new OrdArray(20);
        OrdArray rhs = new OrdArray(20);

        for(int i = 0; i < 20; ++i){
            lhs.insert(StdRandom.uniform(0, 20));
            rhs.insert(StdRandom.uniform(0, 20));
        }
        lhs.display();
        rhs.display();

        OrdArray merged = lhs.merge(rhs);
        merged.display();
    }
}
