# 486. Predict the Winner

**Difficulty:** Medium  
**Topics:** Array, Math, Dynamic Programming, Recursion, Game Theory  
**Link:** https://leetcode.com/problems/predict-the-winner/  
**Date:** 2026-08-01

---

## Approach
Use game theory with dynamic programming to compute the maximum score difference the current player can achieve over the opponent for any subarray. Define dp[i][j] as the best difference (current player's score minus opponent's) for nums[i..j]. The transition is:
dp[i][j] = max(nums[i] - dp[i+1][j], nums[j] - dp[i][j-1]).
Optimize space to O(n) by rolling over j while iterating i from right to left. Player 1 can win or tie if dp[0][n-1] >= 0.

## Complexity
- Time: O(n^2)
- Space: O(n)

## Solution
```java
class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n]; // dp[j] represents dp[i][j] for current i
        
        for (int i = n - 1; i >= 0; --i) {
            dp[i] = nums[i]; // base case: dp[i][i] = nums[i]
            for (int j = i + 1; j < n; ++j) {
                dp[j] = Math.max(nums[i] - dp[j], nums[j] - dp[j - 1]);
            }
        }
        return dp[n - 1] >= 0;
    }
}
```
