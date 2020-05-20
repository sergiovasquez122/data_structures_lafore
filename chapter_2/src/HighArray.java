public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey){
        int j;
        for(j = 0;j < nElems; ++j){
            if(a[j] == searchKey) return true;
        }
        return false;
    }

    public boolean delete(long value){
        int j;
        for(j = 0;j < nElems; ++j){
            if(value == a[j]){
                break;
            }
        }
        if(j  == nElems) return false;

        for(int k = j;k < nElems;++k){
            a[k] = a[k + 1];
        }
        --nElems;
        return true;
    }

    public void insert(long value){
        a[nElems++] = value;
    }

    public void display(){
        for(int i = 0;i < nElems; ++i){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * exercise 2.1 add a method called getMax() that
     * returns the value of the highest key in the array,
     * or -1 if the array is empty. Add some code in main() to
     * exercise this method
     * you can assume all the keys are positive numbers
     * @return the maximum value in array
     */
    public long getMax(){
        long ret = -1;
        for(int i = 0;i < nElems;++i){
            if(ret < a[i]){
                ret = a[i];
            }
        }
        return ret;
    }

    public int size(){
        return nElems;
    }

    public boolean isEmpty(){
        return nElems == 0;
    }

    /**
     * exercise 2
     * Add a method that not only returns the highest key
     * but also removes it from the array
     * @return the maximum value in the array
     */
    public long removeMax(){
        if(isEmpty()){
            return -1;
        }
        long ret = getMax();
        delete(ret);
        return ret;
    }

    /**
     * exercise 2.6 Write a noDups() method for the HighArray class
     * of the highArray program.
     */
    public void noDups(){
        for(int i = 0; i < nElems;++i){
            for(int j = i + 1;j < nElems;++j){
                if(a[i] == a[j]){
                    a[j] = Long.MIN_VALUE;
                }
            }
        }

        int write_idx = 0;
        for(int i = 0;i < nElems;++i){
            if(a[i] != Long.MIN_VALUE){
                a[write_idx++] = a[i];
            }
        }
        nElems = write_idx;
    }
}
