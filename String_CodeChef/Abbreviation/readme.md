# Abbreviation

## 📌 Problem Statement

Given a string `s` and an abbreviation `abbString`, determine whether the abbreviation is **valid** based on the characters present in the original string.

The abbreviation must:

* Have a length between **3 and 5 characters**
* Contain characters that appear in `s`
* Preserve the same order of characters as they appear in `s`

The characters of the abbreviation do not need to be consecutive in the original string.

---

## 💡 Approach

The program uses the **Two Pointer / Subsequence** approach.

Two pointers are used:

* `i` → traverses the original string `s`
* `j` → traverses the abbreviation

### Steps

1. Check whether the abbreviation length is within the allowed range.
2. Start both pointers at `0`.
3. Traverse both strings simultaneously.
4. If `s[i]` matches `abbString[j]`, move `j` forward.
5. Always move `i` forward.
6. At the end, check whether all characters of the abbreviation were matched.
7. Print `TRUE` if valid, otherwise `FALSE`.

---

## 🧠 Example

### Input

```text id="2c8t6s"
internationalization
ion
```

The characters of `ion` appear in `internationalization` in the same order:

```text id="x8l4qy"
i → o → n
```

Therefore:

### Output

```text id="9m1x2v"
TRUE
```

---

## ❌ Example

### Input

```text id="w9x4k2"
computer
put
```

The abbreviation `put` cannot be formed from `computer` while maintaining the required character order.

### Output

```text id="7z6q3n"
FALSE
```

---

## 🔍 Key Logic

The important part of the solution is that the abbreviation is treated as a **subsequence** of the original string.

For example:

```text id="a4v8xk"
s          = "abcdef"
abbString  = "ace"
```

`a`, `c`, and `e` appear in the same order, so the abbreviation is valid.

But:

```text id="h2s9pd"
s          = "abcdef"
abbString  = "eca"
```

does not preserve the order, so it is invalid.

---

## ⚠️ Important Code Note

The current condition:

```text id="n8c1vq"
abbString.length() < 3 && abbString.length() > 5
```

can never become `true`, because a value cannot be **less than 3 and greater than 5 at the same time**.

If the intended valid range is **3 to 5 characters**, the condition should use `||` instead:

```text id="q3w7mx"
length < 3 || length > 5
```

---

## ⏱️ Complexity

Let:

* `n` = length of `s`

* `m` = length of `abbString`

* **Time Complexity:** `O(n)`

* **Space Complexity:** `O(1)`

The two-pointer traversal only scans the original string once.

---

## 🛠️ Concepts Used

* Strings
* Two Pointer Technique
* Subsequence
* Character Comparison
* String Traversal
* Boolean Methods
* `charAt()`

---

## 🔑 Key Takeaway

> To check whether one string can be formed from another while maintaining character order, think of it as a **subsequence problem** and use two pointers.
