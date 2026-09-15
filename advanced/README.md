# 🔴 Advanced Java Programs

> Branch: `advanced` — 15 programs covering data structures, algorithms, collections, concurrency, I/O, and design patterns.

## Requirements

JDK 8 or newer. Every file is self-contained: compile with `javac <File>.java`, run with `java <File>`. Sample input/output is documented at the top of each file.

```bash
git checkout advanced
cd advanced
javac QuickSort.java
java QuickSort
```

## Programs (in recommended order)

| # | File | What you learn |
|---|------|----------------|
| 01 | `QuickSort.java` | quicksort, Lomuto partition, recursion |
| 02 | `MergeSort.java` | mergesort, divide & conquer, stable sort |
| 03 | `SinglyLinkedList.java` | generic linked list: add/insert/delete/reverse |
| 04 | `StackUsingArray.java` | generic resizable stack, LIFO |
| 05 | `BinarySearchTree.java` | BST insert/search, 3 traversals |
| 06 | `WordFrequency.java` | `HashMap`, `getOrDefault`, sorting entries |
| 07 | `LRUCacheDemo.java` | `LinkedHashMap`, access order, eviction |
| 08 | `LambdaStreams.java` | lambdas, filter/map/collect, `groupingBy` |
| 09 | `GenericsBox.java` | generic classes/methods, wildcards |
| 10 | `SingletonDemo.java` | singleton pattern, Bill Pugh holder |
| 11 | `ThreadDemo.java` | `Thread`, `Runnable`, `join`, thread pools |
| 12 | `ProducerConsumer.java` | `BlockingQueue`, poison-pill shutdown |
| 13 | `FileReadWrite.java` | NIO files: write, append, read |
| 14 | `SerializationDemo.java` | `Serializable`, `transient`, object streams |
| 15 | `Dijkstra.java` | graphs, priority queue, shortest paths |

## Compile everything at once

```bash
javac *.java
```

> ⚠️ Running `FileReadWrite` creates `notes.txt` and `SerializationDemo` creates `player.ser` in the folder — both are demo artifacts, safe to delete.

## Where next

You've finished the full path: `basic` → `intermediate` → `advanced`. 🎓
Try extending these: add BST delete, a `Queue` implementation, or JSON persistence.
