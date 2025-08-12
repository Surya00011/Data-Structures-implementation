# Data Structures Implementations in Java

Welcome to the **Data Structures Implementation** repository!  
This project contains clean, well-structured Java implementations of core data structures that are essential for mastering algorithms.

## Linked-List

### Singly Linked-List
- Generic Singly Linked-List class (`<E>`)
- Custom `EmptyListException`
- Operations `addFirst,addLast,addAtIndex,removeByIndex,removeLast,removeFirst,remove,isEmpty,get,getFirst,getLast,clear,contains,addAll,size,indexOf`
- Constructor `default constructor,Iterable,Array`
- `toString()` to print List content
- `Iterator` support for enhanced `for-each` loops
- Sample `main()` class to test the LinkedList

### Doubly LinkedList
- Generic Doubly Linked-List class (`<E>`)
- Custom `EmptyListException`
- Operations `addFirst,addLast,addAtIndex,remove,removeByIndex,removeFirst,removeLast,contains,indexOf,getFirst,getLast,get,isEmpty,size,clear, addAll`
- Constructor `default constructor,Iterable`
- `toString()` to print List content
- `Iterator` support for enhanced `for-each` loops
- Sample `main()` class to test the LinkedList

### Circular Doubly LinkedList
- Generic circular doubly Linked-List class (`<E>`)
- Custom `EmptyListException`
- Operations `addFirst,addLast,addAtIndex,remove,removeByIndex,removeFirst,removeLast,contains,indexOf,getFirst,getLast,get,isEmpty,size,clear, addAll`
- Constructor `default constructor,Iterable`
- `toString()` to print List content
- `Iterator` support for enhanced `for-each` loops
- Sample `main()` class to test the LinkedList


## Stack

### Stack Implementation using Array
- Stack using Object Arrays
- Generic Stack<E> class (`<E>`)
- Custom `StackEmptyException`
- Operations `push,pop,isEmpty,peek,size,increaseCapacity`
- `toString()` method to print stack content
- `Iterator` support for enhanced `for-each` loops
- Sample `main()` class to test the stack
- Example `stack` problem

### Stack Implementation using Linked-List
- Stack using Singly Linked-List
- Generic Stack<E> class(`<E>`)
- Custom `EmptyStackException`
- Operations `push,pop,isEmpty,peek,size`
- `toString()` method to print stack content
- `Iterator` support for enhanced `for-each` loops
- Sample `main()` class to test the stack

## Queue

### Queue using Array
- Generic Queue class (`<E>`)
- Operations `enqueue,dequeue,front`
- Constructor `default constructor`
- `toString()` to print Queue elements
- Sample `main()` class to test the Queue

### Queue using Singly Linked-List
- Generic Queue class(`<E>`)
- Custom `EmptyQueueException`
- Operations `enqueue,enqueueAll,dequeue,dequeueAll,peek,isEmpty,size`
- Constructor `default Constructor,Iterable`
- `toString` to print Queue elements
- `Iterator` support for enhanced `for-each` loops
- Sample `main()` class to test the Queue

### Circular queue using Singly Linked-List
- Generic Queue class (`<E>`)
- Custom `EmptyQueueException`
- Operations `enqueue,enqueueAll,dequeue,dequeueAll,peek,isEmpty,size`
- Constructor `default Constructor,Iterable`
- `toString` to print Queue elements
- `Iterator` support for enhanced `for-each` loops
- Sample `main()` class to test the Queue

### Deque (Double ended queue) using Doubly Linked-List
- Generic Queue class (`<E>`)
- Custom `EmptyDequeException`
- Operations `offerFirst,offerLast,peekFirst,peekLast,pollFirst,pollLast,isEmpty,size`
- Constructor `default Constructor,Iterable`
- `toString` to print Queue elements
- `Iterator` support for enhanced `for-each` loops
- Sample `main()` class to test the Deque

## Tree

### Binary tree
- Generic BinaryTree class(`<E>`) with inner node class
- Operation `insertRight,insertLeft,inOrderTraversal,preOrderTraversal,postOrderTraversal,levelOrderTraversal,contains,construct`
- Constructor `Constructor with one parameter to initialize root node , Constructor with parser and root`
- sample `main()` class to test the BinaryTree

### Binary Search Tree
- Generic BinarySearchTree class(`<E>`) with inner node class
- Operation `insert,search,inOrderTraversal,preOrderTraversal,postOrderTraversal,levelOrderTraversal,contains,delete`
- Constructor `defaut constructor,constructor with on parameter to initialize root node`
- sample `main()` class to test the BinarySearchTree