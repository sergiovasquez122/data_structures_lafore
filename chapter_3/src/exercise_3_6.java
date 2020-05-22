import edu.princeton.cs.algs4.StdRandom;

/**
 * code to test exercise 3.6
 */
public class exercise_3_6 {
    public static void main(String[] args) {
        int max_size = 20;
        ArrayIns arrayIns = new ArrayIns(max_size);
        for(int i = 0;i < max_size;++i){
            arrayIns.insert(StdRandom.uniform(0, 6));
        }

        System.out.println("Prior to sorting");
        arrayIns.display();
        System.out.println("After Sorting and removing duplicates");
        arrayIns.noDupsSort();
        arrayIns.display();
    }
}
