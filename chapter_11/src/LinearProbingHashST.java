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
    }

    public int hash(Key key){
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

    }
}
