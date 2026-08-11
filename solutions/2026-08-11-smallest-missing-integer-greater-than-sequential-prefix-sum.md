# 2996. Smallest Missing Integer Greater Than Sequential Prefix Sum

**Difficulty:** Easy  
**Topics:** Array, Hash Table, Sorting  
**Link:** https://leetcode.com/problems/smallest-missing-integer-greater-than-sequential-prefix-sum/  
**Date:** 2026-08-11

---

## Approach
Scan from the start to find the longest sequential prefix (where each next element is previous + 1) and compute its sum S along the way. Insert all elements of nums into a hash set for O(1) membership checks. Starting from x = S, increment x until it is not present in the set; return that x.

## Complexity
- Time: O(n), where n is the length of nums (the post-sum scan increments at most the number of distinct values).
- Space: O(n) for the hash set.

## Solution
```java
import java.util.HashSet;

class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int i = 1;
        while (i < n && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            i++;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int v : nums) set.add(v);

        int x = sum;
        while (set.contains(x)) {
            x++;
        }
        return x;
    }
}
```
