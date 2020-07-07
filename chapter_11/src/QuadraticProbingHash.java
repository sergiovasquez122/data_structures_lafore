/**
 * Implement a Hash table that uses quadratic probing
 */
public class QuadraticProbingHash<Key, Value> {
    private int N;
    private int M;
    private Key[] keys;
    private Value[] values;

    public QuadraticProbingHash(){
        this(16)
    }

    public QuadraticProbingHash(int M){
        this.M = M;
        this.N = 0;
        keys = (Key[]) new Object[M];
        values = (Value []) new Object[M];
    }

    public int hash(Key key){
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public void insert(Key key, Value value){

    }

    public boolean contains(Key key){
        int counter = 1;
        for(int i = hash(key);keys[i] != null;i = (i + counter * counter) % M, counter++)
            if(key.equals(keys[i]))
                return true;
        return false;
    }
}
