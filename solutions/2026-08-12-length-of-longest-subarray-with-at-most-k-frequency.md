# 2958. Length of Longest Subarray With at Most K Frequency

**Difficulty:** Medium  
**Topics:** Array, Hash Table, Sliding Window  
**Link:** https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/  
**Date:** 2026-08-12

---

## Approach
Use a sliding window with a frequency HashMap. Expand the right end, incrementing the count of the current number. If the count of the current rightmost number exceeds k, shrink the window from the left until the count is at most k again. Track the maximum window size during this process. Since only the element just added can cause a violation, it's sufficient to check and fix counts based on that element.

## Complexity
- Time: O(n)
- Space: O(n)

## Solution
```java
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            int val = nums[right];
            freq.put(val, freq.getOrDefault(val, 0) + 1);

            while (freq.get(val) > k) {
                int lv = nums[left++];
                freq.put(lv, freq.get(lv) - 1);
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
```
