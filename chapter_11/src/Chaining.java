import edu.princeton.cs.algs4.Bag;

public class Chaining {

    private int arraySize;
    private Bag<DataItem>[] table;

    public Chaining(int size){
        arraySize = size;
        table = (Bag<DataItem>[]) new Bag[size];
        for(int i = 0;i < arraySize;++i){
            table[i] = new Bag<>();
        }
    }

}
