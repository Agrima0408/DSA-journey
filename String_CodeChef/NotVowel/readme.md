# NotVowel

## 📌 Problem Statement

Given `n` strings, find and display all strings that **do not contain any vowel**.

The program considers both lowercase and uppercase vowels:

`a, e, i, o, u`
`A, E, I, O, U`

If none of the given strings satisfy the condition, the program prints `-1`.

---

## 💡 Approach

The program checks every string character by character to determine whether it contains a vowel.

### Steps

1. Read the number of strings `n`.
2. Create an `ArrayList` to store strings that contain no vowels.
3. For each string:

   * Traverse all its characters.
   * Check whether the character is a vowel.
   * If a vowel is found, stop checking that string.
4. If no vowel was found, add the string to the list.
5. If no such string exists, print `-1`.
6. Otherwise, print the list of strings without vowels.

---

## 🧠 Example

### Input

```text
5
sky
hello
crypt
world
apple
```

### Explanation

| String  | Contains Vowel? | Result   |
| ------- | --------------- | -------- |
| `sky`   | No              | Selected |
| `hello` | Yes             | Ignored  |
| `crypt` | No              | Selected |
| `world` | Yes             | Ignored  |
| `apple` | Yes             | Ignored  |

### Output

```text
[sky, crypt]
```

---

## ❌ When No String Matches

### Input

```text
3
hello
apple
india
```

Every string contains at least one vowel.

### Output

```text
-1
```

---

## 🔍 Key Logic

A boolean variable is used for each string to track whether a vowel has been found.

Initially:

```text
isvowel = false
```

When a vowel is encountered, it becomes `true` and the loop stops.

Only strings where:

```text
isvowel = false
```

are added to the result list.

The `found` variable keeps track of whether **at least one valid string** was found.

---

## ⏱️ Complexity

Let:

* `n` = number of strings
* `m` = average length of a string

In the worst case, every character of every string is checked.

* **Time Complexity:** `O(n × m)`
* **Space Complexity:** `O(n)` in the worst case for storing all valid strings

---

## 🛠️ Concepts Used

* Strings
* Character Traversal
* Nested Loops
* `charAt()`
* Boolean Variables
* `ArrayList`
* Conditional Statements
* Early Loop Termination

---

## 🔑 Key Takeaway

> When searching for a specific character category, such as vowels, use a boolean flag to track whether the condition has been found and stop traversing as soon as the result is known.
