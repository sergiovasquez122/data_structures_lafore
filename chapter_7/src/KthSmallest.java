import edu.princeton.cs.algs4.StdRandom;

/**
 * Implement a program to find the kth smallest element
 * in an array
 */
public class KthSmallest {


    /**
     * partitions the array such that everything to the left of the pivot is less than
     * it and everything to the right is greater than it
     * @param arr a non-empty array
     * @param left the left starting point of the partition
     * @param right the right starting point of the partition
     * @param pivot_idx the index of the pivot that will be used to partition the array
     * @return the new pivot idx
     */
    private static int partition(int arr[], int left, int right, int pivot_idx){
        int pivot_value = arr[pivot_idx];
        int new_pivot_idx = left;
        swap(arr, pivot_idx, right);
        for(int i = left;i < right;++i){
            if(arr[i] < pivot_value){
                swap(arr, i, new_pivot_idx++);
            }
        }
        swap(arr,new_pivot_idx, right);
        return new_pivot_idx;
    }

    private static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Finds the kth smallest element in the array
     * @param arr a non-empty integer array
     * @param k a number between 1 and the size of the array
     * @return the number that would be the kth smallest if the array was sorted
     */
    public static int kthSmallest(int arr[], int k){
        int left = 0, right = arr.length - 1;
        k--;
        while(left <= right){
            int pivot_idx = StdRandom.uniform(left, right + 1);
            int new_pivot_idx = partition(arr, left, right, pivot_idx);
            if(new_pivot_idx < k){
                left = new_pivot_idx + 1;
            } else if(new_pivot_idx > k){
                right = new_pivot_idx - 1;
            } else {
                return arr[new_pivot_idx];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        // will print sorted array
        for(int i = 0;i < 100;++i){
            for(int k = 1;k <= arr.length;++k){
                int kth = KthSmallest.kthSmallest(arr, k);
                System.out.print(kth + " ");
            }
            System.out.println();
        }
    }
}
