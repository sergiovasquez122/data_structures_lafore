1. The Shellsort works by 
    1. partitioning the array
    2. swapping adjacent elements
    3. dealing with widely separated elements
    4. starting with the normal insertion sort
**3**
2. If an array has 100 elements then knuth algorithm would start with an interval of **40**
3. to transform the insertion sort into the Shellsort, which of the following do you not do
    1. substitute h for 1.
    2. insert an algorithm for creating gaps of decreasing width
    3. enclose the normal insertion sort in a loop
    4. change the direction of the indices in the inner loop
**4**
4. True or false: a good interval sequence for the shellsort is created by repeatedly dividing the array size in half **false**
5. the speed of the shellsort is more than N*logN but less than N*2
6. partitioning is 
    1. putting all elements larger than a certain value on one end of the array
    2. dividing an array in half
    3. partially sorting parts of an array
    4. sorting each half of an array separately
**1**
7. when partitioning, each array element is compared to the **pivot**
8. In partioning, if an array element is equal to the answer to the question 7
    1. it is passed over
    2. it is passed over or not, depending on the other array element
    3. it is placed in the pivot position
    4. it is swapped
**4**
9. true or false: in quicksort, the pivot can be an arbitrary element of the array**true**
10. assuming larger keys on the right, the partition is
    1. the element between the left and right subarrays
    2. the key value of the element between the left and right subarrays
    3. the left element in the right subarray
    4. the key value of the left element in the right subarray
**c**
11. quicksort involves partitioning the original array and then **recursively doing this for the left and right subarrays until a base case is initiated**
12. after a partition in a simple version of quicksort, the pivot 
    1. used to find the median of the array
    2. exchanged with an element of the right subarray
    3. used as the starting point of the next partition
    4. discarded
**2**
13. median-of-three partitioning is a way of choosing the **pivot**
14. in quicksort, for an array of N elements, the partitionIt() method will examine each element approximately **log2n** times
15. true or false: you can speed up quicksort if you stop partitioning when the partition size is 5 and finish by using a different sort **true**
