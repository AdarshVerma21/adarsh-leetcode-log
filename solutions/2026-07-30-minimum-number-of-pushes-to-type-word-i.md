# 3014. Minimum Number of Pushes to Type Word I

**Difficulty:** Easy  
**Topics:** Math, String, Greedy  
**Link:** https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/  
**Date:** 2026-07-30

---

## Approach
Since all letters in the word are distinct and we can remap keys 2–9 arbitrarily, the optimal strategy is to assign up to 8 letters to require 1 push (one per key), the next up to 8 letters to require 2 pushes (second position on each key), the next up to 8 letters to require 3 pushes, and so on. For the i-th letter (0-indexed), the cost is floor(i/8) + 1. Summing these costs for all letters yields the minimum total. With n = word.length, let q = n / 8 and r = n % 8; the sum is 8*(1+2+...+q) + r*(q+1) = 4*q*(q+1) + r*(q+1) = (q+1)*(4*q + r).

## Complexity
- Time: O(1)
- Space: O(1)

## Solution
```java
class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int q = n / 8;
        int r = n % 8;
        return (q + 1) * (4 * q + r);
    }
}
```
