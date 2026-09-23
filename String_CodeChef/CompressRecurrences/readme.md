# CompressRecurrences

## 📌 Problem Statement

Given a string `s` and an integer `n`, compress consecutive repeated characters when their frequency is **greater than or equal to `n`**.

* If a character occurs consecutively at least `n` times, replace the entire sequence with the character followed by its count.
* If it occurs fewer than `n` times, keep the characters unchanged.

---

## 💡 Approach

The program traverses the string and keeps track of the number of **consecutive occurrences** of each character.

A `count` variable is used to store the current repetition count.

### Steps

1. Read the string `s`.
2. Read the minimum compression threshold `n`.
3. Start the repetition count at `1`.
4. Traverse the string character by character.
5. Compare the current character with the next character.
6. If they are the same, increment `count`.
7. When a different character is encountered:

   * If `count >= n`, append the character followed by its count.
   * Otherwise, append the character `count` times without compression.
8. Reset `count` for the next sequence.
9. Print the compressed result.

---

## 🧠 Example

### Input

```text
aaabbccccdd
3
```

### Explanation

The consecutive groups are:

| Character | Count | Compression |
| --------- | ----: | ----------- |
| `a`       |     3 | `a3`        |
| `b`       |     2 | `bb`        |
| `c`       |     4 | `c4`        |
| `d`       |     2 | `dd`        |

Since the threshold is `3`:

```text
aaa → a3
bb  → bb
cccc → c4
dd → dd
```

### Output

```text
a3bbc4dd
```

---

## 🔍 Important Detail

The program compresses **consecutive repetitions**, not the total frequency of a character in the entire string.

For example:

```text
aabaaa
```

with threshold `3` becomes:

```text
aabaa3
```

The two `a`s at the beginning and the three `a`s at the end are treated as **separate groups**.

---

## 🛠️ Why `StringBuilder`?

A `StringBuilder` is used to construct the final string efficiently.

Instead of repeatedly creating new `String` objects while modifying the result, `StringBuilder` allows characters to be appended directly.

---

## ⏱️ Complexity

Let `m` be the length of the input string.

* **Time Complexity:** `O(m)`
* **Space Complexity:** `O(m)`

The string is traversed only once, while the `StringBuilder` stores the resulting string.

---

## 🛠️ Concepts Used

* Strings
* String Traversal
* Consecutive Frequency Counting
* `StringBuilder`
* Conditional Statements
* Character Comparison
* Run-Length Encoding
* Greedy-style Single Pass

---

## 🔑 Key Takeaway

> When processing consecutive repeated characters, maintain a running count and decide how to represent each group only when the group ends.

This is a basic form of **Run-Length Encoding (RLE)** where compression is applied only when the repetition count reaches a specified threshold.
