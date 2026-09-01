# Find All Armstrong Numbers in a Range

## Problem Statement

Given two integers `X` and `Y`, find all Armstrong numbers in the range `[X, Y)`.

An **Armstrong number** is a number whose sum of each digit raised to the power of the total number of digits is equal to the number itself.

For example:

* `153 = 1³ + 5³ + 3³ = 153`
* `9474 = 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474`

If there are no Armstrong numbers in the given range, print `-1`.

### Input

Two integers `X` and `Y`.

### Output

Print all Armstrong numbers between `X` (inclusive) and `Y` (exclusive).

If no Armstrong number exists, print `-1`.

### Example

**Input:**

```text
100 500
```

**Output:**

```text
[153, 370, 371, 407]
```

### Constraints

* `1 ≤ X < Y ≤ 10^6`
* The range may contain zero or more Armstrong numbers.

### Note

The range is **inclusive of `X` and exclusive of `Y`**.
