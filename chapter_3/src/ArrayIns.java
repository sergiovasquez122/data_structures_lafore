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

    /**
     * exercise 3.3
     * add a method called noDups() that removes duplicates from a previously sorted array without
     * altering the order. this algorithm must run in o(n) time
     */
    public void nodups(){
        int write_idx = 1;
        for(int i  = write_idx;i < nElems;++i){
            if(a[i] != a[i - 1]) {
                a[write_idx++] = a[i];
            }
        }
        nElems = write_idx;
    }

    /**
     * exercise 3.6
     * Write insertion sort so that is also removes
     * duplicates from the array
     */
    public void noDupsSort(){
        insertionSort();
        nodups();
    }

    /**
     * exercise 3.5 modify insertion sort
     * so it counts the number of copies and the number of comparison
     * it makes during a sort and display the total.
     */
    public void insertionSortCompare(){
        int copies = 0, comparisons = 0;
        for(int outer = 1; outer < nElems;++outer){
            long temp = a[outer];
            int inner = outer;
            while(inner > 0){
                if(temp <= a[inner - 1]){
                    a[inner] = a[inner - 1];
                    copies++;
                    --inner;
                }
                comparisons++;
            }
            a[inner] = temp;
        }
        System.out.print("Copies: " + copies + ", Comparisons: " + comparisons);
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
