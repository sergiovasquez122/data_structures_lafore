import edu.princeton.cs.algs4.StdRandom;

/**
 * Use the partitioning algorithm
 * in order to compute the median of an array
 */
public class MedianFinding {


    /**
     * Finds the median of an array
     * @param arr a non-empty integer arr
     * @return the median of the array
     */
    public static double median(int arr[]){
        if(arr.length % 2 == 0){
            int k1 = KthSmallest.kthSmallest(arr, arr.length / 2);
            int k2 = KthSmallest.kthSmallest(arr, arr.length/ 2 + 1);
            return (k1 + k2) / 2.0;
        }
        return KthSmallest.kthSmallest(arr, arr.length / 2 + 1);
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 11};
        double value = MedianFinding.median(arr);
        System.out.println(value);
    }
}
