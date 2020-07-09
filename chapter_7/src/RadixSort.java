import edu.princeton.cs.algs4.Queue;

/**
 * Implement radix-sort
 */
public class RadixSort {


    public static void sort(int[] arr, int numDigits){
        Queue<Integer>[] buckets = (Queue<Integer>[]) new Queue[10];
        for(int i = 0;i < buckets.length;++i){
            buckets[i] = new Queue<>();
        }

        int power = 1;
        for(int i = 1;i <= numDigits;++i){

            for(int e : arr){
                int value = e / power;
                buckets[value % 10].enqueue(e);
            }

            int counter = 0;
            for(Queue<Integer> q : buckets){
                while(!q.isEmpty()){
                    arr[counter++] = q.dequeue();
                }
            }
            power *= 10;
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 355, 19, 35, 3222, 2109, 5353};
        RadixSort.sort(arr, 4);
        for(int i = 0;i < arr.length;++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
