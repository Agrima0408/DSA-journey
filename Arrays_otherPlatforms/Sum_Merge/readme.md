# Merge Two Sorted Arrays and Find Middle Sum

## Problem Statement

Given two sorted arrays of equal size `N`, merge them into a single sorted array.

The first array `nums1` has size `2N`, where the first `N` positions contain valid elements and the remaining positions are empty. The second array `nums2` contains `N` elements.

Merge `nums2` into `nums1` **without using an extra array**.

After merging, find the two middle elements of the resulting array and print their sum.

### Input

* The first line contains an integer `N`.
* The second line contains `N` sorted integers representing the valid elements of `nums1`.
* The third line contains `N` sorted integers representing `nums2`.

### Output

1. Print the merged sorted array.
2. Print the sum of the two middle elements.

### Example

**Input:**

```text
4
1 3 5 7
2 4 6 8
```

**Output:**

```text
[1, 2, 3, 4, 5, 6, 7, 8]
9
```

### Constraints

* `1 ≤ N ≤ 10^5`
* Both input arrays are sorted in non-decreasing order.
* Elements are integers.

### Approach

Use the **Two-Pointer technique** from the end of both arrays.

* `i` points to the last valid element of `nums1`.
* `j` points to the last element of `nums2`.
* `k` points to the last position of `nums1`.
* Place the larger element at position `k` and move the corresponding pointer backward.
* Continue until all elements are merged.

Finally, the two middle elements are `nums1[N-1]` and `nums1[N]`, and their sum is printed.

### Complexity

* **Time:** `O(N)`
* **Space:** `O(1)` extra space
