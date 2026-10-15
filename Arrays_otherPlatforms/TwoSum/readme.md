# TwoSum

## 📌 Problem Statement

Given an integer array `arr` and a target value `X`, determine whether there exists a pair of elements whose sum equals `X`.

- Print `"YES"` if such a pair exists.
- Print `"NO"` if no such pair exists.

Each element can be used only once in the pair.

---

## 💡 Approach

The solution uses a **HashSet** to efficiently check whether the required complement of the current element has already been encountered.

For each element, calculate:

`req = X - arr[i]`

If `req` exists in the set, a valid pair has been found.

### Steps

1. Create an empty `HashSet` to store previously visited elements.
2. Traverse the array.
3. Calculate the required complement by subtracting the current element from the target.
4. Check whether the complement exists in the set.
5. If it exists, return `"YES"`.
6. Otherwise, add the current element to the set.
7. If the entire array is traversed without finding a pair, return `"NO"`.

---

## 🧠 Example 1

### Input

```text
arr = [2, 7, 11, 15]
X = 9
```

### Explanation

- First element: `2`
  - Required complement: `9 - 2 = 7`
  - `7` is not in the set, so add `2`.
- Second element: `7`
  - Required complement: `9 - 7 = 2`
  - `2` exists in the set.

A valid pair `(2, 7)` is found.

### Output

```text
YES
```

---

## ❌ Example 2

### Input

```text
arr = [1, 3, 5, 8]
X = 10
```

No two distinct array elements sum to `10`.

### Output

```text
NO
```

---

## 🔍 Why Use a HashSet?

Without hashing, we could check every possible pair using nested loops, taking `O(n²)` time.

A `HashSet` allows us to check whether the required complement exists in **average O(1) time**, avoiding the need to search through all previous elements.

Checking before inserting the current element also ensures that the same array element is not used twice.

---

## ⏱️ Complexity

Let `n` be the length of the array.

- **Time Complexity:** `O(n)` average case
- **Space Complexity:** `O(n)` in the worst case

---

## 🛠️ Concepts Used

- Arrays
- HashSet
- Hashing
- Complement Technique
- Target Sum
- Single-Pass Traversal
- Early Return

---

## 🔑 Key Takeaway

> For Two Sum problems, instead of searching for every possible pair, calculate the complement of each element and use a HashSet to check whether it has already appeared.

This reduces the average time complexity from **O(n²) to O(n)**.
