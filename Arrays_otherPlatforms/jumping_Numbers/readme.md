# Find Jumping Numbers up to N

## Problem Statement

Given a positive integer `N`, find all **Jumping Numbers** from `0` to `N`.

A **Jumping Number** is a number in which the absolute difference between every pair of adjacent digits is exactly `1`.

For example:

* `123` → `|1-2| = 1`, `|2-3| = 1` → Jumping Number
* `898` → `|8-9| = 1`, `|9-8| = 1` → Jumping Number
* `135` → `|1-3| = 2` → Not a Jumping Number

All single-digit numbers are considered Jumping Numbers.

### Input

A single integer `N`.

### Output

Print all Jumping Numbers from `0` to `N` (inclusive).

### Example

**Input:**

```text
50
```

**Output:**

```text
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 21, 23, 32, 34, 43, 45]
```

### Constraints

* `0 ≤ N ≤ 10^6`

### Approach

For every number from `0` to `N`, check whether the absolute difference between each pair of adjacent digits is exactly `1`.

* Single-digit numbers are directly considered Jumping Numbers.
* For multi-digit numbers, compare adjacent digits using `% 10` and `/ 10`.
