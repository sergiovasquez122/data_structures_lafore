/**
 * Program to test exercise 3_5
 */
public class exercise_3_5 {
    public static void main(String[] args) {
        int max_size = 20;
        ArrayIns arrayIns = new ArrayIns(20);

        System.out.println("Already Sorted array");
        // inserts all items into sorted order
        for(int i = 0;i < max_size;++i){
            arrayIns.insert(i);
        }
        arrayIns.insertionSortCompare();
        arrayIns.clear();
        System.out.println();

        System.out.println("Reversely sorted array");
        // inserts all items into sorted order
        // insert all items into unsorted order
        for(int i = max_size - 1;i >= 0;--i){
            arrayIns.insert(i);
        }
        arrayIns.insertionSortCompare();
        System.out.println();
        arrayIns.clear();

        System.out.println("Already Sorted array");
        // inserts all items into partially sorted order
        for(int i = 0;i < max_size -1;++i){
            arrayIns.insert(i);
        }
        arrayIns.insert(3);
        arrayIns.insertionSortCompare();
    }
}
