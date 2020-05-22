/**
 * Tests for even-sort
 */
public class exercise_3_4 {
    public static void main(String[] args) {
        int max_size = 20;
        System.out.println("Sorting already sorted array");
        ArrayBub arrayBub = new ArrayBub(20);
        for(int i = 0;i < max_size; ++i){
            arrayBub.insert(i);
        }
        arrayBub.oddEvenSort();
        arrayBub.display();
        arrayBub.clear();

        System.out.println("Sorting reversely sorted array");
        for(int i = max_size - 1;i >= 0;--i){
            arrayBub.insert(i);
        }
        arrayBub.oddEvenSort();
        arrayBub.display();
        arrayBub.clear();
    }
}
