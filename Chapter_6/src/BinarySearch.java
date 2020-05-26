import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {72, 90, 45, 126, 54, 99, 144, 27, 135, 81, 18, 103, 9, 117, 63, 36};
        Arrays.sort(arr);
        int search_key = 27;
        if( find(arr, search_key) != -1) System.out.println("Found " + search_key);
        else System.out.println("Can't find "  + search_key);
    }

    public static int recFind(int arr[], int target, int lower_bound, int higher_bound){
        if(lower_bound <= higher_bound) {
            int middle = (lower_bound + higher_bound) / 2;
            if (arr[middle] < target) return recFind(arr, target, middle + 1, higher_bound);
            else if (arr[middle] > target) return recFind(arr, target,lower_bound, middle - 1);
            else return middle;
        }
        return -1;
    }

    public static int find(int arr[], int target){
        return recFind(arr, target, 0, arr.length - 1);
    }
}
