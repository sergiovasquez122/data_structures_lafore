public class BubbleSortApp {
    public static void main(String[] args) {
        int max_size = 100;
        ArrayBub arr = new ArrayBub(max_size);

        arr.inser(77);
        arr.inser(99);
        arr.inser(44);
        arr.inser(55);
        arr.inser(22);
        arr.inser(88);
        arr.inser(11);
        arr.inser(0);
        arr.inser(66);
        arr.inser(33);
        arr.display();

        arr.bubbleSort();

        arr.display();
    }
}
