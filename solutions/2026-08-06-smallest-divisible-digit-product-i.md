# 3345. Smallest Divisible Digit Product I

**Difficulty:** Easy  
**Topics:** Math, Enumeration  
**Link:** https://leetcode.com/problems/smallest-divisible-digit-product-i/  
**Date:** 2026-08-06

---

## Approach
Enumerate from n upward and check each number’s digit product modulo t. While computing the product, keep it modulo t to avoid overflow and short-circuit as soon as it becomes 0. If any digit is 0, the product is 0 and thus divisible by t, so we can accept that number immediately. Since there is always a multiple of 10 within at most 10 increments, this enumeration terminates quickly.

## Complexity
- Time: O(log n), since we check at most a constant (≤ 10) numbers and each check scans O(log n) digits.
- Space: O(1)

## Solution
```java
class Solution {
    public int smallestNumber(int n, int t) {
        for (int x = n; ; x++) {
            if (isProductDivisibleByT(x, t)) return x;
        }
    }

    private boolean isProductDivisibleByT(int x, int t) {
        if (t == 1) return true;
        int prodMod = 1 % t;
        int y = x;
        while (y > 0) {
            int d = y % 10;
            if (d == 0) return true; // product becomes 0, divisible by any t >= 1
            prodMod = (prodMod * (d % t)) % t;
            if (prodMod == 0) return true;
            y /= 10;
        }
        return prodMod == 0;
    }
}
```
