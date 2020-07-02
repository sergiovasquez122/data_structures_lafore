public class HashTable {
    private DataItem[] hashArray;
    private int arraySize;
    private DataItem nonItem;

    public HashTable(int size){
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1);
    }

    public void displayTable(){
        System.out.print("Table: ");
        for(int i = 0;i < arraySize;++i){
            if(hashArray[i] != null){
                System.out.print(hashArray[i].getKey() + " ");
            } else System.out.print("** ");
        }
        System.out.println("");
    }

    public int hashFunc(int key){
        return key % arraySize;
    }

    public void insert(DataItem item){
        int key = item.getKey();
        int hashVal = hashFunc(key);
        while(hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1){
            ++hashVal;
            hashVal %= arraySize;
        }
        hashArray[hashVal] = item;
    }

    public DataItem delete(int key){
        int hashVal = hashFunc(key);
        while(hashArray[hashVal] != null){
            if(hashArray[hashVal].getKey() == key){
                DataItem temp = hashArray[hashVal];
                hashArray[hashVal] = nonItem;
                return temp;
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null;
    }

    public DataItem find(int key){
        int hashVal = hashFunc(key);

        while(hashArray[hashVal] != null){
            if(hashArray[hashVal].getKey() == key){
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= arraySize;
        }
        return null;
    }

}
