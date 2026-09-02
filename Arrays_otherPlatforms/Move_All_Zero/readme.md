# Move All Zero

## Problem Statement

Given an array of `N` integers, move all `0`s to the **end of the array** while maintaining the **relative order of all non-zero elements**.

The rearrangement should be done **in-place**, without using an extra array.

### Input

* The first line contains an integer `N`, representing the size of the array.
* The second line contains `N` integers representing the array elements.

### Output

Print the array after moving all zeros to the end.

### Example

**Input:**

```text
8
0 1 0 3 12 0 5 0
```

**Output:**

```text
1 3 12 5 0 0 0 0
```

### Explanation

The non-zero elements are:

```text
1 3 12 5
```

They maintain their original order, while all zeros are moved to the end:

```text
[1, 3, 12, 5, 0, 0, 0, 0]
```

### Constraints

* `1 ≤ N ≤ 10^5`
* Array elements are integers.

### Approach

Use a pointer `c` to keep track of the position where the next non-zero element should be placed.

1. Traverse the array.
2. Whenever a non-zero element is found, place it at index `c` and increment `c`.
3. After all non-zero elements are placed, fill the remaining positions with `0`.

### Complexity

* **Time:** `O(N)`
* **Space:** `O(1)` extra space.
