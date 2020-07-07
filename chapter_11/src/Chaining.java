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

    public int hashFunc(int key){
        return key % arraySize;
    }

    public void insert(int data){
        int hashVal = hashFunc(data);
        table[hashVal].add(new DataItem(data));
    }

    public DataItem find(int key){
        int hashval = hashFunc(key);
        for(DataItem d : table[hashval]){
            if(d.getKey() == key){
                return d;
            }
        }
        return null;
    }
}
