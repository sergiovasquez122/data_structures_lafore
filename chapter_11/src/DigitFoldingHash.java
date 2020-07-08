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
        if(N >= M / 2) resize(2 * M);
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
        if(!contains(key)) return;
        int i;
        for(i = hash(key);!key.equals(keys[i]);i = (i + 1) % M);
        keys[i] = null;
        values[i] = null;
        i = (i + 1) % M;
        while(keys[i] != null){
            Key redoKey = keys[i];
            Value redoValue = values[i];
            keys[i] = null;
            values[i] = null;
            N--;
            insert(redoKey, redoValue);
            i = (i + 1 % M);
        }
        N--;
        if(N > 0 && N == M / 8) resize(M / 2);
    }

    public boolean contains(Key key){
        for(int i = hash(key);keys[i] != null; i = (i + 1) % M){
            if(key.equals(keys[i]))
                return true;
        }
        return false;
    }

    public int hash(Key key){
        int groupSize = keys.length;
        return 0;
    }
}
