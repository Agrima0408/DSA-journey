# Reverse K Chunk

## Problem Statement

Given a string `S` of length `N` and an integer `K`, divide the string into chunks of size `2K`.

For every chunk:

* Keep the first `K` characters unchanged.
* Reverse the next `K` characters.
* Append the modified chunk to the result.

Repeat this process for the entire string.

### Input

* The first line contains an integer `N`, representing the length of the string.
* The second line contains the string `S`.
* The third line contains an integer `K`.

### Output

Print the resulting string after reversing every second `K`-sized chunk.

### Example

**Input:**

```text
12
abcdefghijkl
3
```

**Output:**

```text
abcfedihglkj
```

### Explanation

For `K = 3`, divide the string into chunks of `2K = 6`:

```text
abcdef | ghijkl
```

Process each chunk:

```text
abc + reverse(def) = abcfed
ghi + reverse(jkl) = ihglkj
```

Final result:

```text
abcfedihglkj
```

### Constraints

* `1 ≤ N ≤ 10^5`
* `1 ≤ K ≤ N`
* `N` is divisible by `2K`.
* The string contains lowercase English letters.

### Approach

Use `substring()` to split each `2K`-sized chunk into two parts.

* Keep the first `K` characters unchanged.
* Reverse the second `K` characters using `StringBuilder`.
* Append both parts to the result.
* Move to the next `2K` characters.

### Complexity

* **Time:** `O(N)`
* **Space:** `O(N)`
