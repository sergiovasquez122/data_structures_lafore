/**
 * The removMax method in exercise 2.2
 * suggest a way to sort the contents of an array
 * by key value. Implement a sorting scheme
 * that does not require modifying the
 * HighArray class, but only the code in main().
 *
 */
public class exercise_2_3 {
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        HighArray second_arr = new HighArray(maxSize);
        while(!arr.isEmpty()){
            second_arr.insert(arr.removeMax());
        }
        second_arr.display();
    }
}
