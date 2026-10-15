# TwoSum2

## 📌 Problem Statement

Given an integer array `nums` and a target value `target`, find the indices of two distinct elements whose sum equals the target.

- Return an array containing the indices of the two elements if a valid pair exists.
- Return an empty array if no valid pair is found.
- The same array element cannot be used twice.

## 💡 Approach

The solution uses a **HashSet and nested loops** to find the required pair of elements.

### Steps

1. Create a `HashSet` and store all elements of the array.
2. Traverse the array using index `i`.
3. Calculate the required complement:

   `req = target - nums[i]`

4. Check whether the complement exists in the set.
5. If it exists, traverse the array again to find its index `j`.
6. Ensure that `j != i` so the same element is not used twice.
7. Return the indices `{i, j}` when a valid pair is found.
8. If no pair exists, return an empty array.

## 🧠 Example 1

### Input

```text
nums = [2, 7, 11, 15]
target = 9
```

### Explanation

- Select `nums[0] = 2`.
- Required complement: `9 - 2 = 7`.
- The value `7` exists at index `1`.
- Both elements add up to `9`.

### Output

```text
[0, 1]
```

## 🧠 Example 2

### Input

```text
nums = [3, 3]
target = 6
```

### Explanation

Both elements have the value `3`, but they occupy different indices. The condition `j != i` allows this valid pair.

### Output

```text
[0, 1]
```

## 🔍 Why Use a HashSet?

A `HashSet` provides average `O(1)` lookup time for checking whether the required complement exists.

However, the set stores **values, not indices**. Therefore, the solution uses an additional loop to locate the complement's index in the original array.

The condition `j != i` ensures that an element cannot be paired with itself.

## ⏱️ Complexity

Let `n` be the length of the array.

- **Time Complexity:** `O(n²)` in the worst case because of the nested search.
- **Space Complexity:** `O(n)` for storing array elements in the `HashSet`.

## 🛠️ Concepts Used

- Arrays
- HashSet
- Hashing
- Complement Technique
- Nested Loops
- Array Indices
- Target Sum
- Returning Arrays

## 🔑 Key Takeaway

> A HashSet can quickly check whether a required value exists, but it does not store the indices of those values.

**Optimization tip:** A `HashMap` storing each value and its index can solve this problem in average `O(n)` time and `O(n)` space in a single traversal.
