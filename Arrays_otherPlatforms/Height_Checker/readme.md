# Height Checker

## Problem Statement

Given an array of `N` heights representing the current order of students, determine how many students are **not standing in their expected positions**.

The expected order is obtained by sorting the heights in **non-decreasing order**.

Compare the original array with the sorted array and count the number of positions where the heights differ.

### Input

* The first line contains an integer `N`, representing the number of students.
* The second line contains `N` integers representing their heights.

### Output

Print the number of students who are not in their expected positions.

### Example

**Input:**

```text
6
1 1 4 2 1 3
```

**Output:**

```text
output-3
```

### Explanation

Original array:

```text
[1, 1, 4, 2, 1, 3]
```

Expected sorted array:

```text
[1, 1, 1, 2, 3, 4]
```

Compare both arrays:

```text
Position:   0  1  2  3  4  5
Original:   1  1  4  2  1  3
Expected:   1  1  1  2  3  4
                    ↑     ↑  ↑
```

There are `3` positions where the values are different.

### Constraints

* `1 ≤ N ≤ 10^5`
* `1 ≤ height ≤ 10^5`

### Approach

1. Create a copy of the original array using `clone()`.
2. Sort the copied array using `Arrays.sort()`.
3. Compare the original and sorted arrays element by element.
4. Increment the count whenever the elements at the same position are different.
5. Print the final count.

### Complexity

* **Time:** `O(N log N)` due to sorting.
* **Space:** `O(N)` for the cloned expected array.
