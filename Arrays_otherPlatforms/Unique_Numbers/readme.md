# Unique_Numbers

A Java program that uses a **HashSet** to find numbers that appear an **odd number of times** in an array.

## 💡 Approach

We use a `HashSet<Integer>` to keep track of numbers:

* If the number is **not present** in the set → add it.
* If the number is **already present** → remove it.

This means every occurrence toggles the number's presence in the set.

### Example

```text
Input:
6
1 2 3 2 3 1

Process:
1 → add
2 → add
3 → add
2 → remove
3 → remove
1 → remove

Output:
[]
```

Another example:

```text
Input:
7
1 2 3 2 3 4 4

Output:
[1]
```

Here, `1` occurs once while all other numbers occur twice.

## 🧠 Key Concept

The important operation is:

```java
if(!set.add(x)){
    set.remove(x);
}
```

`HashSet.add(x)` returns:

* `true` → `x` was not already present, so it gets added.
* `false` → `x` was already present, so we remove it.

So the set effectively **toggles** each number every time it appears.

## ⏱️ Complexity

* **Time:** `O(n)` average
* **Space:** `O(n)` in the worst case

## 🛠️ Technologies

* Java
* `HashSet`
* `Scanner`

## 📌 Learning

This problem demonstrates how a `HashSet` can be used for **frequency parity / odd-occurrence tracking** without explicitly storing frequency counts.
