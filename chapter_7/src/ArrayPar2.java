/**
 * programming exercise 7.1
 * Write a partition program that always chooses
 * the rightmost index as the pivot
 */
public class ArrayPar2 {

    public void partition(int arr[]){
        int lt = 0, eq = 0, gt = arr.length;
        int pivot = arr[arr.length - 1];
        while(eq < gt){
            if(arr[eq] == pivot){
                eq++;
            } else if(arr[eq] < pivot){
                swap(arr, eq++, lt++);
            } else {
                swap(arr, eq, --gt);
            }
        }
    }

    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 2, 3, 57, 9, 10, 4, 4};
        ArrayPar2 arrayPar2 = new ArrayPar2();
        arrayPar2.partition(arr);
        for(int i  : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
