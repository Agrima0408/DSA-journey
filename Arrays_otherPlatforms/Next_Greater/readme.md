# NextGreater

## 📌 Problem Statement

Given an array of integers, find the **next greater element** for every element.

The next greater element of an element is the **first element to its right that is greater than it**.

If no greater element exists, the program outputs `0`.

---

## 💡 Approach

The program uses **nested loops** to find the next greater element for each array element.

### Steps

1. Read the size `n` of the array.
2. Store the array elements.
3. For each element:

   * Start checking from the next position.
   * Move towards the right until a greater element is found.
4. Store the first greater element in the `greater` array.
5. If no greater element is found, the default value `0` remains.
6. Print the resulting array.

---

## 🧠 Example

### Input

```text
5
4 5 2 10 8
```

### Explanation

| Element | Next Greater Element |
| ------- | -------------------: |
| 4       |                    5 |
| 5       |                   10 |
| 2       |                   10 |
| 10      |                    0 |
| 8       |                    0 |

So the output is:

```text
5    10    10    0    0
```

---

## 🔍 How It Works

For each element `arr[i]`, the program starts from `i + 1` and checks elements one by one.

As soon as it finds:

```text
arr[j] > arr[i]
```

that element is stored as the answer and the inner loop stops.

This ensures that the **first greater element on the right** is selected.

---

## ⏱️ Complexity

Let `n` be the number of elements in the array.

* **Time Complexity:** `O(n²)`
* **Space Complexity:** `O(n)`

The extra space is used for the `greater` array.

---

## 🛠️ Concepts Used

* Arrays
* Nested Loops
* Array Traversal
* Conditional Statements
* Searching
* Next Greater Element

---

## 🔑 Key Takeaway

> For every element, search towards the right and stop at the first element that is greater.

This is the basic brute-force approach to the **Next Greater Element** problem. It can later be optimized to `O(n)` using a **Stack / Monotonic Stack**.
