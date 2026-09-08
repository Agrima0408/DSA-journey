# RemoveFromSelected

## 📌 Problem Statement

Given two strings `s1` and `s2`, remove the characters from `s1` that are present in `s2`.

The goal is to create a new string containing only those characters from `s1` that are **not selected for removal**.

---

## 💡 Approach

The intended approach is to check every character of `s1` against the characters of `s2`.

### Steps

1. Read two strings `s1` and `s2`.
2. Traverse every character of `s1`.
3. For each character, check whether it exists in `s2`.
4. If the character does not exist in `s2`, add it to the result.
5. Print the resulting string.

---

## 🧠 Example

### Input

```text
programming
aeiou
```

### Explanation

The characters `a`, `e`, `i`, `o`, and `u` are selected for removal.

After removing them:

```text
prgrmmng
```

### Output

```text
prgrmmng
```

---

## ⚠️ Current Implementation Note

The current code compares each character of `s1` with **every character** of `s2` and appends the character whenever one comparison is unequal.

Because of this, a character can be appended multiple times.

For example, if `s2` contains multiple characters, the current implementation may produce duplicate output.

The correct logic should be:

> Add a character from `s1` only if it is **not found anywhere in `s2`**.

This is an important logical correction to make before considering the solution complete.

---

## ⏱️ Complexity

With the nested-loop approach:

* **Time Complexity:** `O(m × n)`
* **Space Complexity:** `O(m)`

Where:

* `m` = length of `s1`
* `n` = length of `s2`

The result string may contain up to `m` characters.

---

## 🛠️ Concepts Used

* Strings
* Character Traversal
* `charAt()`
* Nested Loops
* Character Comparison
* Searching
* String Construction

---

## 🔑 Key Takeaway

> When removing selected characters from a string, each character should be added to the result only after confirming that it does not exist in the removal set.
