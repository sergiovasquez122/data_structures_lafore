public class Merge {

    public static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC){
        int a_idx = 0, b_idx = 0, c_idx = 0;
        while(a_idx < sizeA && b_idx < sizeB){
            arrayC[c_idx++] = arrayA[a_idx] < arrayB[b_idx] ? arrayA[a_idx++] : arrayB[b_idx++];
        }

        while(a_idx < sizeA) arrayC[c_idx++] = arrayA[a_idx++];
        while(b_idx < sizeB) arrayC[c_idx++] = arrayB[b_idx++];
    }

    public static void display(int[] theArray, int size){
        for(int j = 0;j < size;++j){
            System.out.print(theArray[j] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }
}
