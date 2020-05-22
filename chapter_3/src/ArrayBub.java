public class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max){
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value){
        a[nElems] = value;
        nElems++;
    }

    public void clear(){
        nElems = 0;
    }


    /**
     * Exercise 3.4 implement an odd-even sort
     */
    public void oddEvenSort(){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int  i = 1;i < nElems - 1;i += 2){
                if(a[i] > a[i + 1]){
                    sorted = false;
                    swap(i, i + 1);
                }
            }

            for(int i = 0; i < nElems - 1;i += 2){
                if(a[i] > a[i + 1]){
                    sorted = false;
                    swap(i, i  + 1);
                }
            }
        }
    }

    public void display(){
        for(int j = 0;j < nElems; ++j){
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

    /**
     * exercise 3.1
     * modify the bubblesort() method so that it's bidirectional.
     * This mneas the in index will first carry the largest item from the left to the
     * right as before, but when it reaches otu, it will reverse and
     * carry the smallest item from right to left.
     */
    public void bubble_sort_mod(){
        int left_boundary = 0;
        int right_boundary = nElems - 1;

        while(left_boundary < right_boundary){

            for(int i = 0;i < right_boundary;++i){
                if(a[i] > a[i + 1]){
                    swap(i, i + 1);
                }
            }

            --right_boundary;

            for(int i = nElems - 1;i > left_boundary;--i){
                if(a[i] < a[i - 1]){
                    swap(i, i - 1);
                }
            }
            ++left_boundary;
        }
    }

    public void bubbleSort(){
        for(int out = nElems - 1;out > 1;out--){
            for(int in = 0; in < out;in++){
                if(a[in] > a[in + 1]){
                    swap(in, in + 1);
                }
            }
        }
    }

    public void swap(int one, int two){
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
