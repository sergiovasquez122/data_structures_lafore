import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class HashTableApp {
    public static void main(String[] args) {
        DataItem dataItem;
        int aKey, size, n, keysPerCell;
        System.out.print("Enter size of hash table: ");
        size = StdIn.readInt();
        System.out.print("Enter initial number of items: ");
        n = StdIn.readInt();
        keysPerCell = 10;

        HashTable hashTable = new HashTable(size);
        for(int i = 0;i < n;++i){
            aKey = StdRandom.uniform(1) * keysPerCell * size;
            dataItem = new DataItem(aKey);
            hashTable.insert(dataItem);
        }

        while(true){
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, delete, or find: ");
            char choice = StdIn.readChar();
            switch (choice){
                case 's':
                    hashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = StdIn.readInt();
                    dataItem = new DataItem(aKey);
                    hashTable.insert(dataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = StdIn.readInt();
                    hashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = StdIn.readInt();
                    dataItem = hashTable.find(aKey);
                    if(dataItem != null){
                        System.out.println("Found " + aKey);
                    }
                    else System.out.println("Could not find " + aKey);
                    break;

            }
        }
    }
}
