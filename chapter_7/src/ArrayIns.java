public class ArrayIns {
    private long[] theArray;
    private int nElems;

    public ArrayIns(int max){
        theArray = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        theArray[nElems] = value;
        ++nElems;
    }

    public void display(){
        System.out.println("A=");
        for(int i = 0;i < nElems;++i)
            System.out.print(theArray[i] + " ");
        System.out.println();
    }

    public void recQuickSort(int left, int right){
        if(right - left <= 0)
            return;
        else{
            long pivot = theArray[right];

            int partition = partitionit(left, right, pivot);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }

    public int partitionit(int left, int right, long pivot){
        int leftPtr = left - 1;
        int rightPtr = right + 1;
        while(true){
            while(theArray[++leftPtr] < pivot);

            while(rightPtr > 0 && theArray[--rightPtr] > pivot);

            if(leftPtr >= rightPtr) break;
            else swap(leftPtr, rightPtr);
        }
        swap(leftPtr, right);
        return leftPtr;
    }

    private void swap(int i, int j){
        long temp = theArray[i];
        theArray[i] = theArray[j];
        theArray[j] = temp;
    }
}
