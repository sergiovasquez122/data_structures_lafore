1. using big O notation, say how long it takes ideally to find an item in an hash table.
**It would take o(1) time to find an item in a hash table**
2. A **hash function** transforms a range of key values into a range of index values
3. open addressing refers to
    1. keeping many of the cells in the array unoccupied
    2. keeping an open mind about which address to use
    3. probing at cell x + 1, x + 2, and so on until an empty cell is found
    4. looking for another location in the array when the one you want is occupied
***d**
4. using the next position after an unsuccessful probe is called **linear probing**
5. what are the first five steps sizes in quadratic probing
1**2,2**2, 3**2, 4**2, 5**2
6. secondary clustering occurs because
    1. many keys hash to the same location
    2. the sequence of step lengths is always the same
    3. too many items with the same key are inserted
    4. the hash function is not perfect
**2**    
7. separate chaining involves the use of a linked list at each location
8. A reasonable load factor in separate chaining is **1**
9. True or False: A possible hash function for strings involves multiplying each character by an ever-increasing power**true**
10. The best technique when the amount of data is not well known is 
    1. linear probing
    2. quadratic probing
    3. double hashing
    4. separate chaining
**d**    
11. If digit folding is used in a hash function, the number of digits in each group should reflect **array size**
12. true or false: In linear probing an unsuccessful search takes longer than a successful search **false**
13. In separate chaining the time to insert a new item
    1. increases linearly with the load factor
    2. is proportional to the number of items in the table
    3. is proportional to the number of lists
    4. is proportional to the percentage of full cells in the array
**1**
14. True or False: In external hashing, it's important that the records don't become full **false**
15. In external hashing, all records with keys that hash to the same value are located in **the same block**
    
