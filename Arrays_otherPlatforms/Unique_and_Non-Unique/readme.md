# Unique and Non-Unique

## Problem Statement
Given an integer array, count the number of distinct elements that appear exactly once and the number of distinct elements that appear more than once. Return the product of these two counts.

## Approach
- Use a `HashMap` to store the frequency of each element in the array.
- Traverse the map entries:
  - If an element's frequency is `1`, increment the unique counter.
  - Otherwise, increment the non-unique counter.
- Return the product of the two counters.

## Java Concepts Used
- `HashMap`
- `Map.Entry`
- `getOrDefault()`
- Frequency counting
- Enhanced for loop

## Example

**Input:**
```text
arr = [1, 2, 2, 3, 4, 4]
```

**Explanation:**
- Unique elements: `1, 3` → `uni = 2`
- Non-unique elements: `2, 4` → `notuni = 2`
- Product: `2 × 2 = 4`

**Output:**
```text
4
```

## Complexity Analysis
- **Time Complexity:** `O(n)` — to count frequencies and traverse the map.
- **Space Complexity:** `O(n)` — to store element frequencies in the HashMap.

## Key Takeaway
HashMap frequency counting is useful for identifying unique and repeated elements efficiently in an array.
