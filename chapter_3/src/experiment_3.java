import edu.princeton.cs.algs4.Stopwatch;

public class experiment_3 {
    public static void main(String[] args) {
        int max_size = 100000;
        ArrayBub arrayBub = new ArrayBub(max_size);
        ArraySel arraySel = new ArraySel(max_size);
        ArrayIns arrayIns = new ArrayIns(max_size);
        for(int i = 0;i < max_size;++i){
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
