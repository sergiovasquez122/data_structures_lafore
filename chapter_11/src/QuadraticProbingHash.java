/**
 * Implement a Hash table that uses quadratic probing
 */
public class QuadraticProbingHash<Key, Value> {
    private int N;
    private int M;
    private Key[] keys;
    private Value[] values;

    public QuadraticProbingHash(){

    }

    public QuadraticProbingHash(int value){

    }

    public int hash(Key key){
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public void insert(Key key, Value value){

    }

    public boolean contains(Key key){
        for(int i = hash(key);keys[i] != null;++i)
            if(key.equals(keys[i]))
                return true;
        return false;
    }
}
