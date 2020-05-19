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

        for(int k = j;k < nElems - 1;++k){
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
}
