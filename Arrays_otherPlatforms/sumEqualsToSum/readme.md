# SumEqualsToSum

## 📌 Problem Statement

Given an integer array `arr`, determine whether there exist **two pairs of elements whose sums are equal**.

In other words, find four distinct indices \(i, j, k, l\) such that:

\[
arr[i] + arr[j] = arr[k] + arr[l]
\]

If such pairs exist, return `"Yes"`. Otherwise, return `"No"`.

If the array is `null` or contains fewer than four elements, return `"No"`.

---

## 💡 Approach

The solution uses a **HashSet** to store sums of previously encountered pairs.

### Steps

1. Check whether the array is `null` or has fewer than four elements.
2. Create a `HashSet` named `seenSums` to store pair sums.
3. Traverse the array using index `i`.
4. Calculate sums between `arr[i]` and the array elements.
5. Check whether a calculated sum already exists in `seenSums`.
6. If it exists, return `"Yes"`.
7. Otherwise, store the sums of pairs formed between `arr[i]` and the preceding elements.
8. If no matching sum is found, return `"No"`.

---

## 🧠 Example 1

### Input

```text
arr = [1, 2, 3, 4]
```

### Explanation

Two different pairs have the same sum:

- `1 + 4 = 5`
- `2 + 3 = 5`

Since both pairs have equal sums, the condition is satisfied.

### Output

```text
Yes
```

---

## ❌ Example 2

### Input

```text
arr = [1, 2, 4, 8]
```

No two pairs of distinct indices have equal sums.

### Output

```text
No
```

---

## 🔍 Why Use a HashSet?

A `HashSet` stores previously calculated sums and allows average \(O(1)\) lookup.

Instead of comparing every possible pair of pairs directly, the program checks whether a sum has already been encountered.

This reduces the need for a separate nested-loop comparison of all pairs.

---

## ⚠️ Important Implementation Note

The current implementation has a logical issue: its lookup loop considers **all indices**, including the current element itself and elements whose pair sums have not yet been stored. Consequently, it can return `"Yes"` incorrectly.

For example, `[1, 2, 3, 4]` is a valid input, but the current implementation may return `"Yes"` because it checks `arr[i] + arr[i]` against previously stored sums.

To correctly solve the problem, compare sums of pairs that have **four distinct indices**. One reliable approach is to store each pair sum along with its pair of indices and check whether a matching sum comes from a disjoint pair.

---

## ⏱️ Complexity

For the intended pair-sum approach:

- **Time Complexity:** \(O(n^2)\) average, using a suitable pair-processing algorithm.
- **Space Complexity:** \(O(n^2)\) in the worst case to store pair sums.

Here, `n` is the length of the array.

---

## 🛠️ Concepts Used

- Arrays
- HashSet
- Hashing
- Pair Sum
- Nested Loops
- Duplicate Sum Detection
- Combinatorial Pair Processing

---

## 🔑 Key Takeaway

> A HashSet can efficiently detect repeated pair sums, but equal sums alone are not enough: the two pairs must use four distinct array indices.

This problem demonstrates how **hashing can optimize pair-sum problems**, provided the pair-validity conditions are handled correctly.
