# CountOfInstances

## 📌 Problem Statement

Given two strings `s1` and `s2`, find the **number of occurrences of each character of `s1` in `s2`**.

For every character in `s1`, the program checks all characters of `s2` and counts how many times it appears.

---

## 💡 Approach

The program uses **nested loops** to compare characters from both strings.

### Steps

1. Read two strings `s1` and `s2`.
2. Traverse each character of `s1`.
3. For every character of `s1`, traverse the complete string `s2`.
4. Compare the characters.
5. Increment the count whenever a match is found.
6. Print the count for each character of `s1`.

---

## 🧠 Example

### Input

```text
abc
aabbcc
```

### Explanation

For each character of `s1`:

* `a` → appears `2` times in `s2`
* `b` → appears `2` times in `s2`
* `c` → appears `2` times in `s2`

### Output

```text
222
```

The program prints the counts continuously without spaces or new lines.

---

## ⏱️ Complexity

Let:

* `m` = length of `s1`
* `n` = length of `s2`

Since every character of `s1` is compared with every character of `s2`:

* **Time Complexity:** `O(m × n)`
* **Space Complexity:** `O(1)`

---

## 🛠️ Concepts Used

* Strings
* Character Traversal
* `charAt()`
* Nested Loops
* Character Comparison
* Frequency Counting
* `Scanner`
* `nextLine()`

---

## 🔑 Key Takeaway

> Nested loops can be used to compare every character of one string with every character of another string and count character occurrences.
