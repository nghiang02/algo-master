# AlgoMaster

My Data Structures & Algorithms practice in Java: notes, implementations and problem solutions, written while working through DSA topics one at a time.

![Java](https://img.shields.io/badge/Java-21-orange?logo=openjdk)
![Maven](https://img.shields.io/badge/Build-Maven-C71A36?logo=apachemaven)

## Goals

- Implement the core data structures from scratch to understand how they work
- Learn the common problem-solving patterns (two pointers, sliding window, BFS/DFS, DP, ...)
- Practice problems regularly and write down the time & space complexity of every solution

## Project structure

One package per roadmap topic. Each topic folder holds my implementation, the practice problems for that topic, and a `README.md` with notes and a problem table.

```
AlgoMaster/
├── pom.xml
├── README.md
└── src/
    ├── main/java/org/example/
      ├── Main.java
      ├── datastructures/
      │   ├── arrays/
      │   │   ├── README.md          # notes + problem table
      │   │   ├── DynamicArray.java  # my implementation
      │   │   └── TwoSum.java        # a practice problem
      │   ├── linkedlist/
      │   ├── stackqueue/
      │   ├── hashing/
      │   ├── tree/
      │   ├── heap/
      │   ├── graph/
      │   ├── trie/
      │   └── unionfind/
      └── algorithms/
          ├── complexity/
          ├── sorting/
          ├── binarysearch/
          ├── twopointers/
          ├── slidingwindow/
          ├── prefixsum/
          ├── backtracking/
          ├── bfsdfs/
          ├── greedy/
          ├── dp/
          ├── shortestpath/
          ├── topologicalsort/
          └── bitmanipulation/
```


## Roadmap

The roadmap goes top to bottom, so work through it in this order. Tick a box (`- [x]`) when a topic is done.

### Data structures

- [ ] [Arrays & Strings](src/main/java/org/example/datastructures/arrays)
- [ ] [Linked List (singly, doubly)](src/main/java/org/example/datastructures/linkedlist)
- [ ] [Stack & Queue](src/main/java/org/example/datastructures/stackqueue)
- [ ] [Hash Map / Hash Set](src/main/java/org/example/datastructures/hashing)
- [ ] [Binary Tree & Binary Search Tree](src/main/java/org/example/datastructures/tree)
- [ ] [Heap / Priority Queue](src/main/java/org/example/datastructures/heap)
- [ ] [Graph (adjacency list / matrix)](src/main/java/org/example/datastructures/graph)
- [ ] [Trie](src/main/java/org/example/datastructures/trie)
- [ ] [Union-Find (Disjoint Set)](src/main/java/org/example/datastructures/unionfind)

### Algorithms & patterns

- [ ] [Big-O & complexity analysis](src/main/java/org/example/algorithms/complexity)
- [ ] [Sorting (bubble, insertion, merge, quick, ...)](src/main/java/org/example/algorithms/sorting)
- [ ] [Binary Search](src/main/java/org/example/algorithms/binarysearch)
- [ ] [Two Pointers](src/main/java/org/example/algorithms/twopointers)
- [ ] [Sliding Window](src/main/java/org/example/algorithms/slidingwindow)
- [ ] [Prefix Sum](src/main/java/org/example/algorithms/prefixsum)
- [ ] [Recursion & Backtracking](src/main/java/org/example/algorithms/backtracking)
- [ ] [BFS / DFS](src/main/java/org/example/algorithms/bfsdfs)
- [ ] [Greedy](src/main/java/org/example/algorithms/greedy)
- [ ] [Dynamic Programming](src/main/java/org/example/algorithms/dp)
- [ ] [Shortest path (Dijkstra, Bellman-Ford)](src/main/java/org/example/algorithms/shortestpath)
- [ ] [Topological Sort](src/main/java/org/example/algorithms/topologicalsort)
- [ ] [Bit Manipulation](src/main/java/org/example/algorithms/bitmanipulation)

## Problem log

| # | Problem | Topic | Difficulty | Solution |
|---|---------|-------|------------|----------|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/) | Arrays, Hashing | Easy | [TwoSum.java](src/main/java/org/example/datastructures/arrays/TwoSum.java) |


## Resources

- [AlgoMaster.io](https://algomaster.io/)
- [LeetCode](https://leetcode.com/)
- [NeetCode Roadmap](https://neetcode.io/roadmap)
- [VisuAlgo](https://visualgo.net/) for visualizing data structures & algorithms
- [Big-O Cheat Sheet](https://www.bigocheatsheet.com/)

## Author

Nghia
