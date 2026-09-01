# Wordle

## Problem Statement

Given two strings `S` and `T` of length `5`, compare them character by character.

For each position:

* Print `G` if the characters at the same position are equal.
* Print `B` if the characters are different.

The resulting string represents the match pattern between the two words.

### Input

Two strings `S` and `T`, each containing exactly `5` characters.

### Output

Print a string of length `5`:

* `G` → Characters match at the same position.
* `B` → Characters do not match.

### Example

**Input:**

```text
HELLO
HEAVY
```

**Output:**

```text
GGBBB
```

### Explanation

Compare the characters position by position:

```text
S = H E L L O
T = H E A V Y
    G G B B B
```

* `H == H` → `G`
* `E == E` → `G`
* `L != A` → `B`
* `L != V` → `B`
* `O != Y` → `B`

Therefore, the output is `GGBBB`.

### Constraints

* Both strings have exactly `5` characters.
* Strings contain uppercase English letters.

### Approach

Traverse both strings simultaneously using a loop.

For each index, compare the characters using `charAt()` and append either `G` or `B` to the result.

### Complexity

* **Time:** `O(1)` — exactly 5 characters are checked.
* **Space:** `O(1)`
