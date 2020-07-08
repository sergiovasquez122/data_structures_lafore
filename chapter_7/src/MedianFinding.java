import edu.princeton.cs.algs4.StdRandom;

/**
 * Use the partitioning algorithm
 * in order to compute the median of an array
 */
public class MedianFinding {

    private static int partition(int arr[], int left, int right, int pivot_idx){
        int pivot_value = arr[pivot_idx];
        swap(arr, pivot_idx, right);
        int new_pivot_idx = left;
        for(int i = left;i < right;++i){
            if(arr[i] < pivot_value){
                swap(arr, i, new_pivot_idx++);
            }
        }
        swap(arr, new_pivot_idx, right);
        return new_pivot_idx;
    }

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static int median(int arr[]){
        if(arr.length == 0)
            throw new IllegalArgumentException("Given an empty array");

        int left = 0, right = arr.length - 1;
        while(left < right){
            int pivot_idx = StdRandom.uniform(left, right + 1);
            int new_pivot_idx = partition(arr, left, right, pivot_idx);
            if(new_pivot_idx == arr.length / 2){
                return arr[new_pivot_idx];
            }
            if(new_pivot_idx < arr.length / 2){
                left = new_pivot_idx + 1;
            } else {
                right = new_pivot_idx - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int value = MedianFinding.median(arr);
        System.out.println(value);
    }
}
