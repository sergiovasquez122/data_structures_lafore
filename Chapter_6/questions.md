1. If the user enters 10 in the triangle.java program, what is the maximum number of 'copies' of the triangle() method that exist at any one time
10 
2. Where are the copies of the argument, mentioned in question 1, stored?
    1. in a variable in the triangle method
    2. in a field of the TriangleApp class
    3. in a variable of the getString() method
    4. on a stack
**4 on a stack**
3. Assume the user enters 10 as in question 1. What is the value of n when the triangle() method first returns a value other than 1?
**2**
4. Assume the same situation as in question 1. What is the value of n when the triangle() method is about to return to main()
**10**
5. true or false: In the triangle() method, the return values are stored on the stack
**stack**
6. In the anagram.java, at a certain depth of recursion, a versoin of the doAnagram() method is working with the string 'led'. When this method call a new version of itself, what lettrs will the new version be working with?
**ed**
7. We've seen that recursion can take the place of a loop, as in the loop-oriented orderedArray.java program and the recursive binarySearch.java program. Which of the following is not true?
    1. Both programs divide the range repeatedly in half
    2. If the key is not found, the loop version returns because the range bounds cross, but the recursive version occurs because it reaches the bottom recursion level
    3. if the key is found, the loop version returns from the entire method, whereas the recursive version returns from only one level of recursion
    4. in the recursive version the range to be searched must be specified in the argumetns, while in the loop version it not be
**2**    
8. In the recFind() method in the binarySearch. What takes the place of the loop in the non-recursvie version?
    1. the recfind() method
    2. arguments to recfind()
    3. recursive calls to recfind()
    4. the call from main() to recFind()
**3**    
9. The binarySearch program is an example of the __ approach to solving a problem
**divide and conquer**
10. What gets smaller as you make repeated recursive calls in the redFind() method?
**the range to search**
11. What becomes smaller with repeated recursive calles in the towers.java program?
**the number of disks**
12. The algorithms in the towers.java program involves
    1. 'trees' that are data storage device
    2. secretly putting small disks under large disks
    3. changing which columns are the source and destination 
    4. moving one small disk and then a stack of larger disks
**3**    
13. Which is not true about the merge() method in the merge.java program
    1. its algorithm can handle arrays of different sizes
    2. it must search the target array to find where to put the next item.
    3. it is not recursive
    4. it continously takes the smallest item irrspective of what array it's in
**2**   
14. the disadvantage of mergesort is that
    1. it is not recursive
    2. it uses more memory
    3. although faster than the insertion sort, it is must slower than quicksort
    4. it is complicated to implement
**2**
15. Besides a loop, a **stack** can often be used instead of recursion

