# 🟢 Basic Java Programs

> Branch: `basic` — 15 beginner programs. Start here if you're new to Java.

## Requirements

JDK 8 or newer. Every file is self-contained: compile with `javac <File>.java`, run with `java <File>` (no extension). Sample input/output is documented at the top of each file.

```bash
git checkout basic
cd basic
javac HelloWorld.java
java HelloWorld
```

## Programs (in recommended order)

| # | File | What you learn |
|---|------|----------------|
| 01 | `HelloWorld.java` | class, `main`, `println`, command-line args |
| 02 | `AddTwoNumbers.java` | `Scanner`, reading ints, arithmetic |
| 03 | `EvenOdd.java` | if-else, `%` operator, helper methods |
| 04 | `LargestOfThree.java` | if-else-if ladder, logical operators |
| 05 | `SwapNumbers.java` | variables, swap with/without temp |
| 06 | `LeapYear.java` | boolean logic, leap-year rule |
| 07 | `Factorial.java` | for loop, accumulators, `long` overflow |
| 08 | `FibonacciSeries.java` | loops, two-variable iteration |
| 09 | `PrimeCheck.java` | loops, √n optimization, edge cases |
| 10 | `PalindromeNumber.java` | while loop, digit extraction, reversal |
| 11 | `ReverseNumber.java` | digit reversal with sign handling |
| 12 | `SumOfDigits.java` | digit sum + digit count |
| 13 | `MultiplicationTable.java` | for loop, `printf` formatting |
| 14 | `VowelOrConsonant.java` | char input, `switch`, `Character` API |
| 15 | `SimpleCalculator.java` | menu loop, switch, methods, divide-by-zero guard |

## Compile everything at once

```bash
javac *.java
```

## Next step

When these feel easy, switch up: `git checkout intermediate`
