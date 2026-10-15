# CommonElements

## 📌 Problem Statement

Given a 2D array of integers, find all the **distinct elements common to every row** of the array.

- Return the common elements in ascending order.
- If no common elements exist, return a list containing `-1`.
- If the input array is `null` or empty, return `[-1]`.

---

## 💡 Approach

The solution uses a **HashSet and set intersection** to find common elements efficiently.

### Steps

1. Check whether the input array is `null` or empty. If so, return `[-1]`.
2. Store all distinct elements from the first row in a `HashSet`.
3. Traverse each remaining row.
4. Create a temporary `HashSet` containing the distinct elements of the current row.
5. Use `retainAll()` to keep only elements that exist in both sets.
6. Convert the final set into an `ArrayList`.
7. Sort the list in ascending order.
8. If the list is empty, add `-1`.
9. Return the resulting list.

---

## 🧠 Example 1

### Input

```text
arr = [
  [1, 2, 3, 4],
  [2, 3, 4, 5],
  [2, 4, 6, 8]
]
```

### Explanation

- First row: `{1, 2, 3, 4}`
- After processing the second row: `{2, 3, 4}`
- After processing the third row: `{2, 4}`

The common elements are `2` and `4`. They are already sorted in ascending order after the final sorting operation.

### Output

```text
[2, 4]
```

---

## ❌ Example 2

### Input

```text
arr = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]
```

### Explanation

No element appears in every row. The resulting set is empty, so the program returns `-1` in the list.

### Output

```text
[-1]
```

---

## 🔍 Key Logic

### `HashSet`

A `HashSet` stores distinct elements and provides average \(O(1)\) lookup time.

### `retainAll()`

The `retainAll()` method removes elements from the calling set that are not present in the specified collection.

For example:

```text
Set  = {1, 2, 3, 4}
Other = {2, 4, 5}

After retainAll():
Set = {2, 4}
```

Repeating this operation for every row leaves only the elements common to all rows.

### Sorting

Since a `HashSet` does not guarantee sorted order, the final list is sorted using `Collections.sort()`.

---

## ⏱️ Complexity

Let:

- `r` = number of rows
- `c` = maximum number of elements in a row

- **Time Complexity:** Approximately \(O(rc + k\log k)\), where \(k\) is the number of common elements.
- **Space Complexity:** \(O(c)\) auxiliary space, assuming the rows have at most `c` elements.

---

## 🛠️ Concepts Used

- 2D Arrays
- HashSet
- Set Intersection
- `retainAll()`
- `ArrayList`
- `Collections.sort()`
- Duplicate Removal
- Conditional Statements

---

## 🔑 Key Takeaway

> To find elements common to multiple collections, initialize a set with the first collection and repeatedly apply `retainAll()` with each subsequent collection.

This approach combines **hashing, set intersection, and sorting** to find distinct common elements efficiently.
