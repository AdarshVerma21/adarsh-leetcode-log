# 3016. Minimum Number of Pushes to Type Word II

**Difficulty:** Medium  
**Topics:** Hash Table, String, Greedy, Sorting, Counting  
**Link:** https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/  
**Date:** 2026-07-31

---

## Approach
Count the frequency of each letter. Since there are 8 keys (2–9), the first 8 most frequent letters can be assigned to cost 1 (first position on each key), the next 8 to cost 2, and so on. Sort frequencies in descending order and sum freq[i] * (i/8 + 1). This greedy assignment minimizes total pushes.

## Complexity
- Time: O(n + 26 log 26) ≈ O(n), where n is the length of the word
- Space: O(1)

## Solution
```java
import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        for (int i = 0; i < word.length(); i++) {
            freq[word.charAt(i) - 'a']++;
        }
        Arrays.sort(freq); // ascending

        int pushes = 0;
        int slot = 0; // 0..7 -> cost 1, 8..15 -> cost 2, etc.
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) break;
            int cost = slot / 8 + 1;
            pushes += freq[i] * cost;
            slot++;
        }
        return pushes;
    }
}
```
