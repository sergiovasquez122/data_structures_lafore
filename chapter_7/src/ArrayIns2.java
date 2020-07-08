/**
 * Programming exercise 7.2
 * Modify the quickSort program to count the number
 * of copies and comparisons it makes during a sort and then
 * display the total. This program
 * should duplicate the performance of the quickSort2 workshop applet
 * so the copies and comparisons for inversely sorted data should agree
 */
public class ArrayIns2 {
    private long[] theArray;
    private int nElems;
    private int comparisons, copies;

    public ArrayIns2(int max){
        theArray = new long[max];
        nElems = 0;
        comparisons = 0;
        copies = 0;
    }

    public void insert(long value){
        theArray[nElems++] = value;
    }

    public void display(){
        System.out.print("A=");
        for(int i = 0;i < nElems;++i)
            System.out.print(theArray[i] + " ");
        System.out.println();
    }

    public void quickSort(){
        quickSort(0, nElems - 1);
    }

    public void quickSort(int left, int right){
        int size = right - left + 1;
        if(size <= 3)
            manualSort(left, right);
        else {
            long median = medianOf3(left, right);
            int partition  = partitionIt(left, right, median);
            quickSort(left, partition - 1);
            quickSort(partition + 1, right);
        }
    }

    public long medianOf3(int left, int right){
        int center = (left + right) / 2;
        if(theArray[left] > theArray[center]) {
            swap(left, center);
        }

        if(theArray[left] > theArray[right])
            swap(left, right);

        if(theArray[center] > theArray[right])
            swap(center, right);

        comparisons += 3;
        swap(center, right - 1);
        return theArray[right - 1];

    }

    public void swap(int i, int j){
        long temp = theArray[i];
        theArray[i] = theArray[j];
        theArray[j] = temp;
        copies++;
    }

    public int comparisons(){
        return comparisons;
    }

    public int copies(){
        return copies;
    }

    public int partitionIt(int left, int right, long pivot){
        int leftPtr = left;
        int rightPtr = right - 1;

        while(true){
            while(lt(theArray[++leftPtr], pivot));
            while(lt(pivot, theArray[--rightPtr]));
            if(leftPtr >= rightPtr) break;
            else swap(leftPtr, rightPtr);
        }
        swap(leftPtr, right - 1);
        return leftPtr;
    }

    public boolean lt(long lhs, long rhs){
        comparisons++;
        return lhs < rhs;
    }

    public void manualSort(int left, int right){
        int size = right - left + 1;
        if(size <= 1)
            return;
        if(size == 2){
            if(theArray[left] > theArray[right])
                swap(left, right);
            comparisons++;
        } else {
            if(theArray[left] > theArray[right - 1])
                swap(left, right - 1);
            if(theArray[left] > theArray[right])
                swap(left, right);
            if(theArray[right - 1] > theArray[right])
                swap(right - 1, right);
            comparisons += 3;
        }
    }

    public static void main(String[] args) {
        int maxSize = 12;
        ArrayIns2 arrayIns2 = new ArrayIns2(maxSize);
        for(int i = 0;i < maxSize;++i)
            arrayIns2.insert(maxSize - i);
        arrayIns2.quickSort();
        System.out.println("# of comparisons: " + arrayIns2.comparisons + " # of swaps: " + arrayIns2.copies);
    }
}
