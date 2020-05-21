public class ArraySel {
    private long[] a;
    private int nElems;

    public ArraySel(int max){
        a = new long[max];
        nElems = 0;
    }

    public void inser(long value){
        a[nElems] = value;
        nElems++;
    }

    public void display(){
        for(int j = 0;j < nElems; ++j){
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    public void selectionSort(){
        for(int i = 0;i < nElems - 1;++i){
            int min = i;
            for(int j = i + 1;j < nElems;++j){
                if(a[min] > a[j]){
                    min = j;
                }
            }
            swap(min, i);
        }
    }

    public void swap(int one, int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

}
