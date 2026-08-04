# 3731. Find Missing Elements

**Difficulty:** Easy  
**Topics:** Array, Hash Table, Sorting  
**Link:** https://leetcode.com/problems/find-missing-elements/  
**Date:** 2026-08-04

---

## Approach
Use a HashSet to store the existing numbers and simultaneously determine the minimum and maximum values in the array. Then iterate from min to max and collect any numbers not found in the set. This naturally returns the missing integers in sorted order.

## Complexity
- Time: O(n + R), where n is the length of nums and R = max - min + 1
- Space: O(n)

## Solution
```java
import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
            if (x < min) min = x;
            if (x > max) max = x;
        }

        List<Integer> res = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }
        return res;
    }
}
```
