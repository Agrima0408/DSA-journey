# NaniHouse

## 📌 Problem Statement

Nani has several toys, each having a certain weight. She can carry toys as long as their **total weight does not exceed 5000 grams**.

Given the weights of `n` toys, find the **maximum number of toys** that can be carried without exceeding the weight limit of `5000`.

---

## 💡 Approach

To maximize the number of toys, we should always choose the **lightest toys first**.

1. Read the number of toys `n`.
2. Store all toy weights in an array.
3. Sort the array in ascending order.
4. Start adding toy weights from the smallest one.
5. If the total weight remains `≤ 5000`, count that toy.
6. Stop counting once adding a toy would make the total weight exceed `5000`.
7. Print the number of toys that can be carried.

### Why sorting?

Choosing lighter toys first allows us to fit the **maximum possible number of toys** within the weight limit.

---

## 🧠 Example

### Input

```text
5
1000 2000 3000 4000 500
```

### Sorted Array

```text
500 1000 2000 3000 4000
```

### Calculation

```text
500        → total = 500   → count = 1
1000       → total = 1500  → count = 2
2000       → total = 3500  → count = 3
3000       → total = 6500  → exceeds 5000
```

Therefore:

### Output

```text
3
```

---

## ⏱️ Complexity

* **Sorting:** `O(n log n)`
* **Traversal:** `O(n)`
* **Overall Time Complexity:** `O(n log n)`
* **Space Complexity:** `O(n)` for the input array
  *(excluding the space used internally by Java's sorting implementation)*

---

## 🛠️ Concepts Used

* Arrays
* Sorting
* Greedy Approach
* `Arrays.sort()`
* Scanner for input

---

## 📂 Code

```java
import java.util.Arrays;
import java.util.Scanner;

public class NaniHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int weight = 0, toys = 0;

        for (int i = 0; i < n; i++) {
            weight += arr[i];

            if (weight <= 5000) {
                toys++;
            }
        }

        System.out.println(toys);
    }
}
```

---

## 🔑 Key Takeaway

> **When the goal is to maximize the number of items within a fixed weight/cost limit, consider sorting the items by weight/cost and choosing the smallest ones first.**

This is a simple example of a **Greedy Algorithm**.
