# ReverseLettersOnly

## 📌 Problem Statement

Given a string containing letters and non-letter characters, reverse **only the letters** while keeping all non-letter characters in their original positions.

The relative positions of special characters, numbers, or other non-alphabetic characters should remain unchanged.

---

## 💡 Approach

The program uses the **Two Pointer** technique.

Two pointers are maintained:

* `left` → starts from the beginning
* `right` → starts from the end

### Steps

1. Convert the string into a character array.
2. Place one pointer at the beginning and another at the end.
3. If the character at `left` is not alphabetic, move `left` forward.
4. If the character at `right` is not alphabetic, move `right` backward.
5. If both characters are letters, swap them.
6. Move both pointers inward.
7. Continue until the pointers meet.
8. Convert the character array back into a string.

---

## 🧠 Example

### Input

```text
a-bC-dEf!
```

### Letter Positions

The non-letter characters:

```text
-  -  !
```

remain in their original positions.

The letters:

```text
a b C d E f
```

are reversed:

```text
f E d C b a
```

### Output

```text
f-Eb-dCa!
```

---

## 🔍 Two Pointer Technique

The important part of the solution is that the pointers **skip non-alphabetic characters**.

For example:

```text
a - b @ C
↑         ↑
left      right
```

If `right` points to `@`, it moves backward until it reaches `C`.

Only when both pointers point to letters does a swap occur.

This allows the program to reverse letters without disturbing special characters.

---

## ⚡ Why Use Two Pointers?

Instead of creating another collection of letters and rebuilding the string, the program modifies the character array **in-place**.

This makes the solution efficient and demonstrates a common pattern used in string and array problems.

---

## ⏱️ Complexity

Let `n` be the length of the string.

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)`

The `O(n)` space is required for the character array created from the input string.

---

## 🛠️ Concepts Used

* Strings
* Character Arrays
* Two Pointer Technique
* Character Swapping
* `Character.isAlphabetic()`
* String Traversal
* In-place Modification

---

## 🔑 Key Takeaway

> When only certain characters need to be reversed while others must stay fixed, the **Two Pointer technique** can efficiently find and swap the required characters from both ends.
