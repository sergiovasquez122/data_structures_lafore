import edu.princeton.cs.algs4.StdRandom;

public class ArrayIns2 {
    private long[] theArray;
    private int nElems;

    public ArrayIns2(int max){
        theArray = new long[max];
        nElems = 0;
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
        if(theArray[left] > theArray[center])
            swap(left, center);

        if(theArray[left] > theArray[right])
            swap(left, right);

        if(theArray[center] > theArray[right])
            swap(center, right);

        swap(center, right - 1);
        return theArray[right - 1];

    }

    public void swap(int i, int j){
        long temp = theArray[i];
        theArray[i] = theArray[j];
        theArray[j] = temp;
    }

    public int partitionIt(int left, int right, long pivot){
        int leftPtr = left;
        int rightPtr = right - 1;

        while(true){
            while(theArray[++leftPtr] < pivot);

            while(theArray[--rightPtr] > pivot);

            if(leftPtr >= rightPtr) break;
            else swap(leftPtr, rightPtr);
        }
        swap(leftPtr, right - 1);
        return leftPtr;
    }

    public void manualSort(int left, int right){
        int size = right - left + 1;
        if(size <= 1)
            return;
        if(size == 2){
            if(theArray[left] > theArray[right])
                swap(left, right);
        } else {
            if(theArray[left] > theArray[right - 1])
                swap(left, right - 1);
            if(theArray[left] > theArray[right])
                swap(left, right);
            if(theArray[right - 1] > theArray[right])
                swap(right - 1, right);
        }
    }

    public static void main(String[] args) {
        int maxSize = 16;
        ArrayIns2 arr = new ArrayIns2(maxSize);
        for(int i = 0;i < maxSize;++i){
            long value =  StdRandom.uniform(100);
            arr.insert(value);
        }
        arr.display();
        arr.quickSort();
        arr.display();
    }
}
