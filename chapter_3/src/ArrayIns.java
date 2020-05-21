public class ArrayIns {
    private long[] a;
    private int nElems;

    public ArrayIns(int max){
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public void display(){
        for(int j = 0;j < nElems; ++j){
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    /**
     * exercise 3.2 add a method called median() to the ArrayIns class.This method
     * should return the median value in the array. Assume that the array was already sorted;
     * @return the median of the array
     */
    public long median(){
        return nElems % 2 == 1 ? a[nElems / 2]  : (a[nElems / 2]  + a[nElems / 2 + 1]) / 2;
    }

    public void insertionSort(){
        int in, out;
        for(out = 1; out < nElems;++out){
            long temp = a[out];
            in = out;
            while(in > 0 && a[in - 1]  >= temp){
                a[in] = a[in-1];
                in--;
            }
            a[in] = temp;
        }
    }
}
