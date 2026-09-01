# Mileage Matters

## Problem Statement

A vehicle needs to travel a distance of `N` kilometers.

You have two fuel options:

* **Petrol:** The vehicle travels `X` kilometers per unit of petrol.
* **Diesel:** The vehicle travels `Y` kilometers per unit of diesel.

Assume the vehicle can be filled with half the distance in petrol and one-fourth of the distance in diesel.

Determine which fuel gives better mileage based on the calculated travel distances.

Print:

* `PETROL` if petrol gives better mileage.
* `DIESEL` if diesel gives better mileage.
* `ANY` if both provide the same mileage.

### Input

Five integers `N`, `X`, `Y`, `A`, and `B`.

### Output

Print `PETROL`, `DIESEL`, or `ANY` based on the comparison.

### Example

**Input:**

```text
100 10 20 0 0
```

**Output:**

```text
PETROL
```

### Explanation

For `N = 100`:

* Petrol distance = `100 / 2 = 50`
* Diesel distance = `100 / 4 = 25`
* Petrol calculation = `50 × 10 = 500`
* Diesel calculation = `25 × 20 = 500`

Since both values are equal, the output should be `ANY`.

### Approach

Calculate the petrol and diesel values using integer division and compare them.

* If petrol value is smaller, print `PETROL`.
* If diesel value is smaller, print `DIESEL`.
* Otherwise, print `ANY`.

### Complexity

* **Time:** `O(1)`
* **Space:** `O(1)`
