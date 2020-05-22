/**
 * Program to test exercise 3_5
 */
public class exercise_3_5 {
    public static void main(String[] args) {
        int max_size = 20;
        ArrayIns arrayIns = new ArrayIns(20);

        // inserts all items into sorted order
        for(int i = 0;i < max_size;++i){
            arrayIns.insert(i);
        }

        arrayIns.insertionSortCompare();
    }
}
