# Class Position

## Problem Statement

Given an array of `N` integers representing the marks or scores of students, determine the **rank/position of each student** based on their score.

A student with the highest score gets **rank 1**. For each student, their rank is calculated as:

**Rank = 1 + number of students having a strictly higher score.**

### Input

* The first line contains an integer `N`, representing the number of students.
* The second line contains `N` integers representing the scores of the students.

### Output

Print the rank of each student in the same order as their original positions.

### Example

**Input:**

```text
5
50 80 60 90 70
```

**Output:**

```text
41312
```

### Explanation

Scores:

```text
50 → Rank 5
80 → Rank 2
60 → Rank 4
90 → Rank 1
70 → Rank 3
```

Therefore, the ranks in the original order are:

```text
5 2 4 1 3
```

### Constraints

* `1 ≤ N ≤ 10^5`
* Scores are integers.

### Approach

For every student:

1. Start their rank at `1`.
2. Compare their score with every other student's score.
3. If another student has a strictly higher score, increment the rank.
4. Store the calculated rank in the `pos` array.
5. Print all ranks in the original order.

### Complexity

* **Time:** `O(N²)` due to comparing every pair of students.
* **Space:** `O(N)` for storing the ranks.
