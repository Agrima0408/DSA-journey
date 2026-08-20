# String Rotation based on Digit Sum Squared

## Problem Description

Given an alphanumeric string containing a mixture of letters and digits, perform a string rotation based on the following rules:

1. Calculate the rotation factor ($k$) by finding the sum of the squares of all digits present in the input string.
2. Filter the original string to retain only the alphabetic characters, keeping their relative order. Let this modified string be $S$ with length $M$.
3. Determine the direction of rotation based on the parity of $k$:
   - **If $k$ is Even:** Perform a **Right Rotation** on string $S$ by $k \pmod M$ positions.
   - **If $k$ is Odd:** Perform a **Left Rotation** on string $S$ by $k \pmod M$ positions.

---

## Input Format

- A single line containing an alphanumeric string `s`.

## Output Format

- Print the rotated alphabetic string on a single line.

---

## Constraints

- $1 \le \vert{}s\vert{} \le 10^5$
- The input string contains at least one alphabetic character.

---

## Sample Tests

### Sample 1

**Input**
```text
a1b2c3

**Output**
```text
bca
