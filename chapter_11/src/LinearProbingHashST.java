/**
 * Implement a linear probe table that stores strings
 * (Note this implementation allows us to use any key
 * that implements hashcode
 */
public class LinearProbingHashST<Key, Value> {
    private int N;
    private int M;
    private Key[] keys;
    private Value[] values;

    public LinearProbingHashST(){
        this(16);
    }

    public LinearProbingHashST(int M){
        keys = (Key[]) new Object[M];
        values = (Value[]) new Object[M];
        N = 0;
        this.M = M;
    }

    private int hash(Key key){
        return (key.hashCode() & 0x7fffffff) % M;
    }

    public void resize(int cap){
        LinearProbingHashST<Key, Value> temp = new LinearProbingHashST(cap);
        for(int i = 0;i < M;++i)
            if(keys[i] != null)
                temp.put(keys[i], values[i]);
        this.keys = temp.keys;
        this.values = temp.values;
        this.M = temp.M;
    }

    public void put(Key key, Value value){
        if(N >= M / 2) resize(2 * M);
        int i;
        for(i = hash(key);keys[i] != null;i = (i + 1) % M){
            if(keys[i].equals(key)){
                values[i] = value;
                return;
            }
        }
        keys[i] = key;
        values[i] = value;
        N++;
    }

    public Value get(Key key){
        for(int i = hash(key);keys[i] != null;i = (i + 1) % M)
            if(keys[i].equals(key))
                return values[i];
        return null;
    }

    public boolean contains(Key key){
        for(int i = hash(key);keys[i] != null; i = (i + 1) % M){
            if(keys[i].equals(key)){
                return true;
            }
        }
        return false;
    }

    public void delete(Key key){
        if(!contains(key)) return;
        int i = hash(key);
        while(!keys.equals(keys[i])) i = (i  + 1) % M;
        keys[i] = null;
        values[i] = null;
        i = (i + 1) % M;
        while(keys[i] != null){
            Key keyToRedo = keys[i];
            Value valToRedo = values[i];
            keys[i] = null;
            values[i] = null;
            N--;
            put(keyToRedo, valToRedo);
            i = (i + 1) % M;
        }
        N--;
        if(N > 0 && N == M / 8) resize(M / 2);
    }
}
