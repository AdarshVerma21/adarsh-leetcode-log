# 1406. Stone Game III

**Difficulty:** Hard  
**Topics:** Array, Math, Dynamic Programming, Game Theory  
**Link:** https://leetcode.com/problems/stone-game-iii/  
**Date:** 2026-08-03

---

## Approach
Use dynamic programming on score differences. Let dp[i] be the maximum difference (current player's total score minus the opponent's) obtainable starting from index i. On a turn, the player can take 1–3 stones; if they take a total of sum over k stones, the opponent then faces state i+k with advantage dp[i+k]. Therefore, dp[i] = max over k∈{1,2,3} of (sum(i..i+k-1) − dp[i+k]). Initialize dp[n] = 0 and compute backwards. The final result depends on the sign of dp[0]: positive means Alice wins, negative means Bob wins, zero means a tie.

## Complexity
- Time: O(n)
- Space: O(n)

## Solution
```java
class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n + 1]; // dp[n] = 0 by default

        for (int i = n - 1; i >= 0; i--) {
            int best = Integer.MIN_VALUE;
            int take = 0;
            for (int k = 0; k < 3 && i + k < n; k++) {
                take += stoneValue[i + k];
                best = Math.max(best, take - dp[i + k + 1]);
            }
            dp[i] = best;
        }

        if (dp[0] > 0) return "Alice";
        if (dp[0] < 0) return "Bob";
        return "Tie";
    }
}
```
