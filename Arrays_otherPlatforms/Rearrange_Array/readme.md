# Rearrange Array

## Problem Statement

Given an array of `N` integers, rearrange its elements such that:

* The **largest remaining element** is placed at every even index (`0, 2, 4, ...`).
* The **smallest remaining element** is placed at every odd index (`1, 3, 5, ...`).

The rearranged array should alternate between the largest and smallest available elements.

### Input

* The first line contains an integer `N`, representing the size of the array.
* The second line contains `N` integers representing the elements of the array.

### Output

Print the rearranged array.

### Example

**Input:**

```text
6
1 2 3 4 5 6
```

**Output:**

```text
615243
```

### Explanation

First sort the array:

```text
[1, 2, 3, 4, 5, 6]
```

Then alternately select the largest and smallest elements:

```text
6 1 5 2 4 3
```

Therefore, the rearranged array is:

```text
6 1 5 2 4 3
```

### Constraints

* `1 ≤ N ≤ 10^5`
* Array elements are integers.

### Approach

1. Sort the array in ascending order.
2. Maintain two pointers:

   * `left` → smallest remaining element.
   * `right` → largest remaining element.
3. At every even index, place the element at `right`.
4. At every odd index, place the element at `left`.
5. Move the corresponding pointer after placing each element.

### Complexity

* **Time:** `O(N log N)` due to sorting.
* **Space:** `O(N)` for the answer array.
