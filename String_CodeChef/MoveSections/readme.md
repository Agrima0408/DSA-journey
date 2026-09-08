# MoveSections

## 📌 Problem Statement

Given a string, move the characters present at positions that are **multiples of 4 or 6** to the end of the string while keeping all other characters in their original relative order.

Positions are considered using **1-based indexing**.

---

## 💡 Approach

The program divides the characters into two sections:

* Characters whose positions are multiples of `4` or `6`
* All remaining characters

The selected characters are stored separately and appended to the end after the main traversal.

### Steps

1. Read the input string.
2. Traverse the string using its index.
3. Convert the zero-based index into a **1-based position**.
4. Check whether the position is divisible by `4` or `6`.
5. If yes, store that character in a separate string.
6. Otherwise, add it to the main result.
7. After traversal, append the selected characters to the end.
8. Print the final string.

---

## 🧠 Example

### Input

```text id="h4m2qk"
abcdefghijkl
```

### Position Analysis

| Position | Character | Action |
| -------: | :-------: | :----- |
|        1 |     a     | Keep   |
|        2 |     b     | Keep   |
|        3 |     c     | Keep   |
|        4 |     d     | Move   |
|        5 |     e     | Keep   |
|        6 |     f     | Move   |
|        7 |     g     | Keep   |
|        8 |     h     | Move   |
|        9 |     i     | Keep   |
|       10 |     j     | Keep   |
|       11 |     k     | Keep   |
|       12 |     l     | Move   |

Positions `4, 6, 8, 12` are selected.

### Result

Characters kept in their original section:

```text
abcegijk
```

Moved characters:

```text
dfhl
```

### Output

```text id="s0h7gc"
abcegijkdfhl
```

---

## 🔍 Important Detail

The program uses:

```text
index = i + 1
```

because Java string indexes start from `0`, while the problem's positions are treated as starting from `1`.

For example:

```text
Java Index:     0  1  2  3  4  5
Position:       1  2  3  4  5  6
Character:      a  b  c  d  e  f
```

Therefore, `i + 1` is used to correctly identify positions divisible by `4` or `6`.

---

## ⏱️ Complexity

Let `n` be the length of the string.

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)`

Additional space is used to store the resulting sections of the string.

---

## 🛠️ Concepts Used

* Strings
* String Traversal
* Indexing
* 1-Based vs 0-Based Indexing
* Modulo Operator `%`
* Conditional Statements
* String Construction

---

## 🔑 Key Takeaway

> When a problem refers to positions rather than Java indexes, remember to convert the **0-based index into 1-based position** before applying conditions such as divisibility.
