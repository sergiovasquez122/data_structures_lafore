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
        swap(arr, pivot_idx, right);
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
        return 0;
    }

    public static void main(String[] args) {

    }
}
