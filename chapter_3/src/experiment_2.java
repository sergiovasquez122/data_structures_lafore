import edu.princeton.cs.algs4.Stopwatch;

/**
 * Insert date inversly sorted into an array using the same amount of data as in Experiment 1.
 * See how fast the sort runs cmpared with the random data in experiment 1
 */
public class experiment_2 {
    public static void main(String[] args) {
        int max_size = 100000;
        ArrayBub arrayBub = new ArrayBub(max_size);
        ArraySel arraySel = new ArraySel(max_size);
        ArrayIns arrayIns = new ArrayIns(max_size);
        for(int i = max_size - 1;i >= 0;--i){
            arrayBub.insert(i);
            arraySel.insert(i);
            arrayIns.insert(i);
        }
        Stopwatch watch = new Stopwatch();
        arrayBub.bubbleSort();
        System.out.println("Elasped time for bubble sort: " + watch.elapsedTime());

        watch = new Stopwatch();
        arraySel.selectionSort();
        System.out.println("Elasped time for selection sort: " + watch.elapsedTime());

        watch = new Stopwatch();
        arrayIns.insertionSort();
        System.out.println("Elasped time for insertion sort: " + watch.elapsedTime());
    }
}
