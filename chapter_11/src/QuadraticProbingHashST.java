/**
 * Implement a Hash table that uses quadratic probing
 */
public class QuadraticProbingHashST<Key, Value> {
    private int N;
    private int M;
    private Key[] keys;
    private Value[] values;

    public QuadraticProbingHashST(){
        this(16);
    }

    public QuadraticProbingHashST(int M){
        this.M = M;
        this.N = 0;
        keys = (Key[]) new Object[M];
        values = (Value []) new Object[M];
    }

    public int hash(Key key){
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public void insert(Key key, Value value){
        if(N >= M / 2) resize(M * 2);
        int i;
        int counter = 1;
        for(i = hash(key);keys[i] != null;i = (i + counter * counter) % M, counter++){
            if(key.equals(keys[i])){
                values[i] = value;
                return;
            }
        }
        N++;
        keys[i] = key;
        values[i] = value;
    }

    public void delete(Key key){

    }

    public void resize(int cap){
        QuadraticProbingHashST<Key, Value> temp = new QuadraticProbingHashST<>();
        for(int i = 0;i < M;++i){
            if(keys[i] != null){
                temp.insert(keys[i], values[i]);
            }
        }
        this.M = temp.M;
        this.keys = temp.keys;
        this.values = temp.values;
    }

    public Value get(Key key){
        int counter = 1;
        for(int i = hash(key);keys[i] != null;i = (i + counter * counter) % M, counter++){
            if(key.equals(keys[i])){
                return values[i];
            }
        }
        return null;
    }

    public boolean contains(Key key){
        int counter = 1;
        for(int i = hash(key);keys[i] != null;i = (i + counter * counter) % M, counter++)
            if(key.equals(keys[i]))
                return true;
        return false;
    }
}
