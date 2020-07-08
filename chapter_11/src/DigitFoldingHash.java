/**
 * Using a LinearProbing hashtable, use digit-folding as
 * a hash technique. you program should work for any array size
 * and any key size
 */
public class DigitFoldingHash<Key, Value> {
    private int N;
    private int M;
    private Key[] keys;
    private Value[] values;

    public DigitFoldingHash(){
        this(16);
    }

    public DigitFoldingHash(int M){
        this.N = 0;
        this.M = M;
        keys = (Key[]) new Object[M];
        values = (Value[]) new Object[M];
    }

    public void resize(int cap){
        DigitFoldingHash<Key, Value> temp = new DigitFoldingHash<>(cap);
        for(int i = 0;i < M;++i)
            if(keys[i] != null)
                temp.insert(keys[i], values[i]);
        keys = temp.keys;
        values = temp.values;
        M = temp.M;
    }

    public void insert(Key key, Value value){
        if(N == M / 2) resize(2 * M);
        int i;
        for(i = hash(key);keys[i] != null;i = (i + 1) % M){
            if(key.equals(keys[i])){
                values[i] = value;
                return;
            }
        }
        keys[i] = key;
        values[i] = value;
        N++;
    }

    public Value get(Key key){
        for(int i = hash(key);keys[i] != null;i = (i + 1) % M){
            if(key.equals(keys[i])){
                return values[i];
            }
        }
        return null;
    }

    public void delete(Key key){

    }

    public boolean contains(Key key){
        for(int i = hash(key);keys[i] != null; i = (i + 1) % M){
            if(key.equals(keys[i]))
                return true;
        }
        return false;
    }

    public int hash(Key key){
        return 0;
    }
}
