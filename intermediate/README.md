# 🟡 Intermediate Java Programs

> Branch: `intermediate` — 15 programs bridging basics to real problem-solving: arrays, strings, searching/sorting, matrices, OOP, and exceptions.

## Requirements

JDK 8 or newer. Every file is self-contained: compile with `javac <File>.java`, run with `java <File>`. Sample input/output is documented at the top of each file.

```bash
git checkout intermediate
cd intermediate
javac ArrayMaxMin.java
java ArrayMaxMin
```

## Programs (in recommended order)

| # | File | What you learn |
|---|------|----------------|
| 01 | `ArrayMaxMin.java` | single-pass min/max over an array |
| 02 | `ReverseArray.java` | in-place reversal, two pointers |
| 03 | `SecondLargest.java` | tracking top-two, distinct values |
| 04 | `BubbleSort.java` | nested loops, early-exit sorting |
| 05 | `LinearSearch.java` | linear scan, `-1` sentinel |
| 06 | `BinarySearch.java` | divide & conquer, O(log n), overflow-safe mid |
| 07 | `ReverseString.java` | `StringBuilder` vs manual reversal, immutability |
| 08 | `PalindromeString.java` | two pointers, case/punctuation-insensitive check |
| 09 | `AnagramCheck.java` | normalization, sorting, `Arrays.equals` |
| 10 | `CountWords.java` | `split` regex, multi-line input |
| 11 | `MatrixAddition.java` | 2D arrays, nested loops |
| 12 | `MatrixMultiplication.java` | triple loop, dimension compatibility |
| 13 | `Student.java` | classes, constructors, `this`, `toString` |
| 14 | `BankAccount.java` | encapsulation, validation in methods |
| 15 | `ExceptionHandling.java` | try-catch-finally, custom exceptions |

## Compile everything at once

```bash
javac *.java
```

## Where next

- Feeling good? `git checkout advanced`
- Shaky on basics? `git checkout basic`
