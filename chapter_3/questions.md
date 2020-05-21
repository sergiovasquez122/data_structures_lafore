1. Computer sorting algorithms are more limited than humans in that
	1. humans are better at inventing new algorithms.
	2. computers can handle only a fixed amount of data
	3. humans know what to sort, whereas computers need to be told
	4. computers can compare only two things at a time
**4**
2. The two basic operations in simple sorting are **comparing** items and **swapping** them

3. true or false: the bubble sort always ends up comparing every item with every other item
**true**

4. the bubble sort algorithm alternates between
	1. comparing and swapping
	2. moving and copying
	3. moving and comparing
	4. copying and comparing
**i.comparining and swapping**

5. true or false: if there are N items, the bubble sort makes exactly N * N comparisions
**False**
6. In the selection sort
	1. the largest keys accumulate on the left 
	2. a minimum key is repeatedly discovered **correct**
	3. a number of items must be shifted to insert each item in its correctly sorted position
	4. the sorted items accumulate on the right

7. true or false: if, in a particular sortin situation, swaps take much longer than comparisions, the selction sort is about twice as fast as the bubble sort **true**

8. A copy is **twice** times as fast as a swap

9. What is the invariant in the selection sort? **items to the left of outer are sorted**

10. In the insertion sort, the 'marked player' described in the text corresponds to which variable in the java program
	1. in
	2. out
	3. temp
	4. a[out]
**temp**
11. In the insertion sort, 'partially sorted' means that
	1. some items are already sorted, but they may need to be moved
	2. most items are in their final sorted positions, but a few stil ned to be sorted
	3. only some of the items are sorted
	4. group items are sorted among themselves, but items outside the group may need to be inserted in it
**4**
12. shifting a group of items left or right requires repeated **copying**

13. In the insertion sort, after an item is inserted in the partially sorted group, it will
	1. never be moved again
	2. never be shifted to the left
	3. often be moved out of this group
	4. find that its group is steadily shrinking
**never be shifted to the left**
14. The invariant in the insertion sort is that **items with indices less than the outer are partiall sorted**

15. stability might refer to 
	1. items with secondary keys being excluded from a sort
	2. keeping cities sorted by increasing population within each state, in a sort by state
	3. keeping the same first names matched with the same last names
	4. items keeping the same order of primary keys without regards to secondary keys
**2**
