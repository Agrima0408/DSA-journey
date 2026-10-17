# Prefix Sum

This folder contains my Java solutions to **Prefix Sum problems** as part of my DSA journey.

## 📌 What is Prefix Sum?

Prefix Sum is a technique in which we store the cumulative sum of array elements to answer range-sum queries efficiently.

For an array `arr`, the prefix sum at index `i` is:

`prefixSum[i] = prefixSum[i - 1] + arr[i]`

The first element is initialized as:

`prefixSum[0] = arr[0]`

## 🧠 Key Concepts

- Building a prefix sum array
- Calculating the sum of a given range
- Optimizing repeated range-sum queries
- Using prefix sums to simplify array problems
- Combining Prefix Sum with Hashing when required

## 🎯 Why Prefix Sum?

Instead of repeatedly traversing an array to calculate range sums, prefix sums allow us to preprocess the array once and answer each range-sum query in **O(1)** time.

For an inclusive range `[L, R]`:

- If `L == 0`, range sum = `prefixSum[R]`
- Otherwise, range sum = `prefixSum[R] - prefixSum[L - 1]`

## ⏱️ Complexity

- **Preprocessing:** O(n)
- **Range Sum Query:** O(1)
- **Space:** O(n)

## 📂 Problems

Solutions will be added here as I learn and practice Prefix Sum problems on LeetCode and other coding platforms.

## 🚀 Goal

Understand the pattern, solve problems independently, and improve problem-solving skills through consistent practice.

*debug. cry. repeat.*

