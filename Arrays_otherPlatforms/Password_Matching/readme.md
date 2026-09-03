# PasswordMatching

## 📌 Problem Statement

Given a password string `s`, another string `r`, and a series of rotation operations, determine whether `r` matches the password after applying all the rotations to `s`.

If the lengths of the two strings are different, the password is immediately rejected.

The program prints:

* `password accepted` if the rotated password matches `r`
* `try again` otherwise

---

## 💡 Approach

The program uses **string rotation** to check whether the second string can be obtained from the first string after applying all given rotations.

### Steps

1. Read the original password `s`.
2. Read the target password `r`.
3. Read the number of rotation operations `t`.
4. Add all rotation values to calculate the **net rotation**.
5. Check whether both strings have the same length.
6. Normalize the rotation using:

   ```java
   rotate = rotate % n;
   ```
7. If the rotation is negative, convert it into an equivalent positive rotation.
8. Rotate the string using `substring()`.
9. Compare the rotated string with `r`.
10. Print the appropriate result.

---

## 🔄 String Rotation

The rotation is performed using:

```java
String rotated = s.substring(n - rotate) + s.substring(0, n - rotate);
```

For example:

```text
s = "abcdef"
rotate = 2
```

The last 2 characters are moved to the front:

```text
"ef" + "abcd"
= "efabcd"
```

So the rotated string becomes:

```text
efabcd
```

---

## 🧠 Handling Multiple Rotations

Instead of rotating the string after every operation, the program simply adds all rotation values:

```java
rotate += sc.nextInt();
```

For example:

```text
Rotations: 2 3 -1
Net rotation = 2 + 3 - 1 = 4
```

Only the final rotation of `4` needs to be performed.

This makes the solution more efficient.

---

## 🔁 Handling Negative Rotations

The program uses:

```java
rotate = rotate % n;

if (rotate < 0) {
    rotate += n;
}
```

This ensures that the rotation always falls within the valid range:

```text
0 ≤ rotate < n
```

For example, if:

```text
n = 6
rotate = -2
```

Then:

```text
-2 % 6 = -2
-2 + 6 = 4
```

So rotating right by `-2` positions is equivalent to rotating right by `4` positions.

---

## 🧪 Example

### Input

```text
abcdef
efabcd
1
2
```

### Explanation

Original string:

```text
abcdef
```

Rotation:

```text
2
```

After rotating right by 2 positions:

```text
efabcd
```

Since the rotated string matches `r`:

### Output

```text
password accepted
```

---

## ❌ Example 2

### Input

```text
abcdef
cdabef
1
2
```

After rotating:

```text
efabcd
```

It does not match `cdabef`.

### Output

```text
try again
```

---

## ⏱️ Complexity

Let `n` be the length of the password and `t` be the number of rotation operations.

* Reading rotations: `O(t)`
* String rotation: `O(n)`
* String comparison: `O(n)`
* **Overall Time Complexity:** `O(t + n)`
* **Space Complexity:** `O(n)`

---

## 🛠️ Concepts Used

* Strings
* String Rotation
* `substring()`
* `equals()`
* Modular Arithmetic
* Handling Negative Values
* Multiple Operations
* Scanner Input

---

## 📂 Code

```java
import java.util.Scanner;

public class PasswordMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String r = sc.next();
        int t = sc.nextInt();

        int rotate = 0;

        while (t-- > 0) {
            rotate += sc.nextInt();
        }

        int n = s.length();

        if (n != r.length()) {
            System.out.println("try again");
            sc.close();
            return;
        }

        rotate = rotate % n;

        if (rotate < 0) {
            rotate += n;
        }

        String rotated = s.substring(n - rotate)
                + s.substring(0, n - rotate);

        if (rotated.equals(r)) {
            System.out.println("password accepted");
        } else {
            System.out.println("try again");
        }

        sc.close();
    }
}
```

---

## 🔑 Key Takeaway

> Instead of performing every rotation separately, calculate the **net rotation** first and perform only one rotation at the end.

This reduces unnecessary operations and demonstrates how **modular arithmetic + string manipulation** can simplify rotation problems.
