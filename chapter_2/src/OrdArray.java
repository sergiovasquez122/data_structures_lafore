public class OrdArray {
    private long[] a;
    private int nElems;

    public OrdArray(int max){
        a = new long[max];
        nElems = 0;
    }

    public int size(){
        return nElems;
    }

    public int find(long searchKey){
        int lower_bound = 0;
        int upper_bound = nElems - 1;

        while(lower_bound <= upper_bound){
            int middle = (lower_bound + upper_bound) / 2;
            if(a[middle] == searchKey) return middle;
            else if(a[middle] < searchKey){
                lower_bound = middle + 1;
            } else {
                upper_bound = middle - 1;
            }
        }
        return nElems;
    }

    public void insert(long value){
        int i;
        for(i = 0;i < nElems;++i){
            if(value < a[i]){
                break;
            }
        }
        for(int k = nElems;k > i;k--){
            a[k] = a[k - 1];
        }
        a[i] = value;
        nElems++;
    }

    public boolean delete(long value){
        int j = find(value);
        if(j == nElems) return false;

        for(int i = j;i < nElems;++i){
            a[i] = a[i + 1];
        }

        --nElems;
        return true;
    }

    public void display(){
        for(int i = 0; i < nElems; ++i){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

     /**
      * Exercise 2.5
     * Add a merge() method to the OrdArray class so that
     * you can merge two ordered source arrays into an
     * ordered destination array
     * @param rhs the other array to be merged
     * @return the destination array
     */
    public OrdArray merge(OrdArray rhs){
        int destination_size = size() + rhs.size() - 1;
        OrdArray destination = new OrdArray(destination_size);
        int left_index = size() - 1;
        int right_index = rhs.size() - 1;
        for(int i = destination_size; i >= 0; --i){
            destination.insert(a[left_index] < rhs.a[right_index] ? a[right_index--]  : a[left_index--]);
        }
        return destination;
    }
}
