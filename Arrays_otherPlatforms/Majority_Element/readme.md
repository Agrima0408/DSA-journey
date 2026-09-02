# Majority Element

## Problem Statement

Given an array of `N` integers, find the **majority element**.

An element is called a majority element if it appears **more than `N/2` times** in the array.

If a majority element exists, print it. Otherwise, print:

```text
No majority element
```

### Input

* The first line contains an integer `N`, representing the size of the array.
* The second line contains `N` integers representing the elements of the array.

### Output

Print the majority element if it exists.

If no element occurs more than `N/2` times, print `No majority element`.

### Example 1

**Input:**

```text
7
2 2 1 2 3 2 2
```

**Output:**

```text
2
```

### Example 2

**Input:**

```text
5
1 2 3 4 5
```

**Output:**

```text
No majority element
```

### Explanation

For the first example:

* `N = 7`
* `N/2 = 3`
* `2` occurs `5` times.

Since `5 > 3`, `2` is the majority element.

### Constraints

* `1 ≤ N ≤ 10^5`
* Array elements are integers.

### Approach

For each element, count how many times it occurs in the array using a nested loop.

If its frequency is greater than `N/2`, print that element as the majority element.

### Complexity

* **Time:** `O(N²)`
* **Space:** `O(N)`
