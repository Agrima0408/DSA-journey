# 🔑 Hashing — DSA Journey

> debug. learn. repeat.

This folder contains my Java solutions to hashing problems as part of my DSA journey. The focus is on understanding how `HashSet` and `HashMap` help solve problems efficiently through lookups, duplicate detection, frequency counting, and key-value mappings.

## 📚 Concepts Covered

- **HashSet:** Storing unique elements and checking membership.
- **HashMap:** Storing key-value pairs for efficient lookups.
- **Frequency Counting:** Tracking the occurrences of elements.
- **Duplicate Detection:** Identifying repeated elements.
- **Complement Pattern:** Finding previously encountered values that complete a target sum.
- **Mapping:** Maintaining relationships between characters, numbers, and words.
- **Grouping:** Grouping elements that share common properties.

## 🛠️ Java Collections

| Collection | Purpose | Common Operations |
|---|---|---|
| `HashSet` | Store unique elements | `add()`, `contains()`, `remove()` |
| `HashMap` | Store key-value pairs | `put()`, `get()`, `containsKey()`, `getOrDefault()` |

### Common HashMap Pattern — Frequency Counting

```java
Map<Integer, Integer> map = new HashMap<>();

for (int x : nums) {
    map.put(x, map.getOrDefault(x, 0) + 1);
}
```

This pattern counts the frequency of each number in an array.

---

## 1. HashSet-Based Questions

HashSet is useful when the main requirement is uniqueness, membership checking, or duplicate detection.

| # | Problem | LeetCode |
|---:|---|---|
| 36 | Valid Sudoku | [#36](https://leetcode.com/problems/valid-sudoku/) |
| 128 | Longest Consecutive Sequence | [#128](https://leetcode.com/problems/longest-consecutive-sequence/) |
| 202 | Happy Number | [#202](https://leetcode.com/problems/happy-number/) |
| 217 | Contains Duplicate | [#217](https://leetcode.com/problems/contains-duplicate/) |
| 349 | Intersection of Two Arrays | [#349](https://leetcode.com/problems/intersection-of-two-arrays/) |
| 771 | Jewels and Stones | [#771](https://leetcode.com/problems/jewels-and-stones/) |
| 2215 | Find the Difference of Two Arrays | [#2215](https://leetcode.com/problems/find-the-difference-of-two-arrays/) |

## 2. HashMap-Based Questions

HashMap is useful for frequency counting, mapping relationships, complement lookups, and grouping elements.

| # | Problem | LeetCode |
|---:|---|---|
| 1 | Two Sum | [#1](https://leetcode.com/problems/two-sum/) |
| 169 | Majority Element | [#169](https://leetcode.com/problems/majority-element/) |
| 205 | Isomorphic Strings | [#205](https://leetcode.com/problems/isomorphic-strings/) |
| 242 | Valid Anagram | [#242](https://leetcode.com/problems/valid-anagram/) |
| 290 | Word Pattern | [#290](https://leetcode.com/problems/word-pattern/) |
| 347 | Top K Frequent Elements | [#347](https://leetcode.com/problems/top-k-frequent-elements/) |
| 383 | Ransom Note | [#383](https://leetcode.com/problems/ransom-note/) |
| 387 | First Unique Character in a String | [#387](https://leetcode.com/problems/first-unique-character-in-a-string/) |
| 454 | 4Sum II | [#454](https://leetcode.com/problems/4sum-ii/) |
| 49 | Group Anagrams | [#49](https://leetcode.com/problems/group-anagrams/) |

## 🎯 Learning Goals

- Understand when to use `HashSet` versus `HashMap`.
- Recognize common hashing patterns independently.
- Improve time complexity using efficient lookups.
- Practise frequency counting, mapping, and grouping.
- Build confidence in solving unfamiliar DSA problems.

## 📌 Future Topics

Prefix Sum + HashMap problems will be maintained in a **separate folder** once I learn that pattern.

## 💻 Language & Tools

- **Language:** Java
- **Practice Platform:** LeetCode
- **Version Control:** Git and GitHub

---

*One problem at a time. One pattern at a time.*

