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

    /**
     * exercise 2.4 add implementations of insert and delete using binary search
     * @param value
     * @return true if item was found
     */
    public boolean delete_bin_search(long value){
        int idx = find(value);
        if(idx == -1){
            return false;
        }

        for(int i = idx;i < nElems;i++){
            a[i] = a[i + 1];
        }
        return true;
    }

    public boolean insert_bin_search(long key){
        int idx = -1;
        int low  = 0;
        int hi = size() - 1;
        while(low <= hi){
            int mid = (low + hi) / 2;
            if(a[mid] == key){
                return false;
            } else if(key < a[mid]){
                hi = mid - 1;
            } else {
                low = mid + 1;
            }
            idx = mid;
        }
        for(int i = nElems;i > idx;--i){
            a[i] = a[i - 1];
        }
        nElems++;
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
        int destination_size = size() + rhs.size();
        OrdArray destination = new OrdArray(destination_size);
        int left_index = size() - 1;
        int right_index = rhs.size() - 1;
        for(int i = destination_size - 1; i >= 0; --i){
            if(left_index >= 0) {
                destination.insert(a[left_index] < rhs.a[right_index] ? rhs.a[right_index--] : a[left_index--]);
            } else {
                destination.insert(rhs.a[right_index--]);
            }
        }
        return destination;
    }
}
