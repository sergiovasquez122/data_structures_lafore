1. Insertions and deletions in a tree require what big O time?
O(h) where h is the height of the tre

2. A binary tree is a search tree if
    1. Every non-leaf node has children who key values are less than the parent
    2. every left child has a key less than the parent and every right child has a key greater than the parent
    3. in the path from the root to every leaf node, the key of each node is greater than the key of its parent
    4. a node can have a maximum of two children
**2** 
3. true or false: not all trees are binary trees
**true**
4. In a complete binary tree with 20 nodes, and the root considered to be at level 0, how many nodes are there at level 4
**5**
5. A subtree of a binary tree always has
    1. a root that is a child of the main tree's root
    2. a root unconnected to the main tree's root
    3. fewer nodes than the main tree
    4. a sibling with the same number of nodes
**3** 
6. In the java code for a tree, the **Node** and the **Tree** are generally separate classes

7. Finding a node in a binary search tree involves going from node to node, asking
        1. how big the node's key is in relation to the search key
        2. how big the node's key is compare to its right or left children
        3. what leaf node we want to reach
        4. what level are we on
**1**       
8. An unbalanced tree is on
    1. in which most of the keys have values greater than the average
    2. whose behavior is unpredictable
    3. in which the root or some other node has many more left children than the right children, or vice versa
    4. that is shaped like an umbrella
**3** 
9. Inserting a node starts with the same steps as **finding** a node

10. Suppose a node A has a successor node S. The Node S must have a key that is larger than A but smaller than or equal to every other node in the right subtree of A

11. In a binary tree use to represent a mathematical expression, which of the following is not true?
    1. both children of an operator node must be operands
    2. following a postorder traversal no parentheses need to be added
    3. following a inorder traversal parentheses must be added
    4. in pre-order traversal, a node is visited before either of its children
**4** 
12. If a tree is represented by an array, the right child of a node at index n has an index of 
2*n+1
13. True or False: Deleting a node with one child from a binary search tree involves finding that node's successor
**False**
14. A huffman tree is typically used to **compress** text

15. Which of the following is not true about a huffman tree?
    1. The most frequently used characters always appear near the top of the tree
    2. Normally, decoding a message involves repeatly following a path from the root to a leaf
    3. in coding a character you typically start at a leaf and work upward
    4. The tree can be generated by removal and insertion operations on a priority queue
**3**