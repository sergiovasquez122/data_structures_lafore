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
        for(int k = nElems-1;k > i;k--){
            a[k] = a[k - 1];
        }
        a[i] = value;
        nElems++;
    }

    public boolean delete(long value){
        int j = find(value);
        if(j == nElems) return false;

        for(int i = j;i < nElems - 1;++i){
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
}
