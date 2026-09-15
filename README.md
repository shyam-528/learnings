# 📚 Learnings

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat&logo=openjdk&logoColor=white)
![JDK 8+](https://img.shields.io/badge/JDK-8%2B-blue)
![Programs](https://img.shields.io/badge/programs-45-brightgreen)
![License](https://img.shields.io/badge/license-MIT-blue)

My college learning journey in **Java** — from first `HelloWorld` to multithreading, design patterns, and graph algorithms. Every concept is a small, self-contained program you can compile and run in seconds.

> 🧭 **How this repo is organized:** each difficulty level lives on its **own branch**. Switch branches to switch levels.

---

## 🌿 Branches

| Branch | Level | What's inside | Start here |
|--------|-------|---------------|------------|
| [`basic`](https://github.com/shyam-528/learnings/tree/basic) | 🟢 Basic | 15 programs — syntax, loops, conditions, numbers | `basic/HelloWorld.java` |
| [`intermediate`](https://github.com/shyam-528/learnings/tree/intermediate) | 🟡 Intermediate | 15 programs — arrays, strings, sorting, OOP, exceptions | `intermediate/ArrayMaxMin.java` |
| [`advanced`](https://github.com/shyam-528/learnings/tree/advanced) | 🔴 Advanced | 15 programs — DSA, collections, threads, I/O, patterns | `advanced/QuickSort.java` |
| `main` | 📖 Index | This landing README only | — |

Each level branch contains its programs **plus its own README** with a program index, concepts covered, and sample outputs.

---

## 🚀 How to Run (any branch, any program)

**Requirements:** JDK 8 or newer ([download](https://www.oracle.com/java/technologies/downloads/)). Check with:

```bash
javac -version
java -version
```

**Compile & run a single program:**

```bash
# 1. Switch to the level you want
git checkout basic          # or: intermediate / advanced

# 2. Go into the level folder
cd basic                    # or: intermediate / advanced

# 3. Compile (example)
javac HelloWorld.java

# 4. Run (no .java / .class extension)
java HelloWorld
```

**Compile everything in a level at once:**

```bash
cd basic
javac *.java
```

> 💡 Every `.java` file is self-contained (class name = file name) and documents its sample input/output in a comment at the top.

---

## 🗺 Learning Path

```text
basic  →  intermediate  →  advanced
  │              │               │
  ▼              ▼               ▼
syntax,      arrays, strings,  DSA, threads,
loops,       searching,        collections,
conditions   sorting, OOP      I/O, patterns
```

**Suggested order:** finish `basic` top-to-bottom, then `intermediate`, then `advanced`. Each level's README lists programs in recommended order.

---

## 📁 Repository Layout

```text
learnings/
├── README.md            # this file (main branch)
│
├── basic/               # branch: basic (15 programs)
│   ├── README.md
│   ├── HelloWorld.java
│   └── ...
│
├── intermediate/        # branch: intermediate (15 programs)
│   ├── README.md
│   ├── ArrayMaxMin.java
│   └── ...
│
└── advanced/            # branch: advanced (15 programs)
    ├── README.md
    ├── QuickSort.java
    └── ...
```

---

## 🤝 Contributing

Learning in public — suggestions welcome!

```bash
git checkout -b feat/<your-program>
# add your .java file in the right level folder
git add -A
git commit -m "feat(basic): add <program name>"
git push -u origin feat/<your-program>
```

Then open a Pull Request against the matching level branch.

## 📄 License

MIT — learn, share, and build freely.

## 👤 Author

**shyam-528** — documenting my college coding journey, one program at a time.
