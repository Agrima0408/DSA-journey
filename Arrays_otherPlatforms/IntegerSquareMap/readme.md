# IntegerSquareMap

## Problem Statement
Given an integer array, create a map where each distinct integer is mapped to its square. Store the results in ascending order of the original integers and return the key-value pairs as a list of integer arrays.

## Approach
1. Create a `TreeMap<Integer, Integer>` to store each integer and its square.
2. Traverse the input array and insert each element as the key and its square as the value.
3. Since `TreeMap` sorts keys in ascending order, the entries are automatically ordered.
4. Create an `ArrayList<int[]>` to store the results.
5. Traverse the map using `entrySet()`.
6. For every entry, add a new integer array containing the key and its square.
7. Return the resulting list.

## Java Concepts Used
- `TreeMap`
- `Map.Entry`
- `entrySet()`
- `ArrayList`
- `List<int[]>`
- Enhanced `for` loop
- Key-value mapping
- Automatic sorting

## Example

**Input:**
```text
arr = [3, 1, 2, 3]
```

**Map after processing:**
```text
1 → 1
2 → 4
3 → 9
```

**Output:**
```text
[[1, 1], [2, 4], [3, 9]]
```

## Complexity Analysis
Let `n` be the length of the input array and `k` be the number of distinct elements.

- **Time Complexity:** `O(n log k)` for inserting elements into the `TreeMap`, followed by `O(k)` for traversing the map and building the result.
- **Space Complexity:** `O(k)` for the map and `O(k)` for the returned list, excluding the input array.

## Important Observation
- `TreeMap` maintains keys in ascending order.
- Duplicate keys overwrite their previous values, so only distinct input integers appear in the result.
- Integer multiplication can overflow for sufficiently large input values.

## Key Takeaway
Use `TreeMap` when you need sorted key-value pairs, and use `entrySet()` to traverse both keys and values together.
