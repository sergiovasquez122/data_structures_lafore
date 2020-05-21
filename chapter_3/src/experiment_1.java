import edu.princeton.cs.algs4.Stopwatch;

/**
 * create a large array and fill that array with data.
 * try inserting 10,000 items. Display the data before and after the sort. You'll
 * see that scrolling the display takes a long time. Commment out the calls to display()
 * so you can see how long the sort itself takes. The time will vary on different machines.
 * then use the same array size to compare the speed between insertion sort and selection sort
 */
public class experiment_1 {
    public static void main(String[] args) {
        int max_size = 100000;
        ArrayBub arrayBub = new ArrayBub(max_size);
        ArraySel arraySel = new ArraySel(max_size);
        ArrayIns arrayIns = new ArrayIns(max_size);

        for(int i = 0;i < max_size;++i){
            long n = (long) (java.lang.Math.random() * (max_size  - 1));
            arrayBub.insert(n);
            arraySel.insert(n);
            arrayIns.insert(n);
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
