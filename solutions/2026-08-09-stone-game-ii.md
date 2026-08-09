# 1140. Stone Game II

**Difficulty:** Medium  
**Topics:** Array, Math, Dynamic Programming, Minimax, Prefix Sum, Game Theory, Zero-Sum Game  
**Link:** https://leetcode.com/problems/stone-game-ii/  
**Date:** 2026-08-09

---

## Approach
Use minimax dynamic programming with suffix sums. Let suffix[i] be the total stones from pile i to the end. Define dp(i, M) as the maximum stones the current player can obtain starting from index i with parameter M. If the player can take all remaining piles (i + 2M >= n), return suffix[i]. Otherwise, for each choice X in [1, 2M], the current player takes the first X piles and then the opponent plays optimally from i + X with M' = max(M, X). Since the total remaining is suffix[i], the current player’s gain for a choice X is suffix[i] - dp(i + X, M'). Take the maximum over all X. Memoize dp by (i, M) to avoid recomputation.

## Complexity
- Time: O(n^3) in the worst case (n^2 states and up to 2M ≤ O(n) transitions per state)
- Space: O(n^2) for memoization plus O(n) for suffix sums

## Solution
```java
import java.util.Arrays;

class Solution {
    private int n;
    private int[] suffix;
    private int[][] memo;

    public int stoneGameII(int[] piles) {
        n = piles.length;
        suffix = new int[n + 1];
        for (int i = n - 1; i >= 0; --i) {
            suffix[i] = suffix[i + 1] + piles[i];
        }
        memo = new int[n][n + 1];
        for (int i = 0; i < n; ++i) {
            Arrays.fill(memo[i], -1);
        }
        return dfs(0, 1);
    }

    private int dfs(int i, int m) {
        if (i >= n) return 0;
        if (2 * m >= n - i) return suffix[i];
        if (memo[i][m] != -1) return memo[i][m];

        int best = 0;
        for (int x = 1; x <= 2 * m; ++x) {
            int next = dfs(i + x, Math.max(m, x));
            int take = suffix[i] - next;
            if (take > best) best = take;
        }
        memo[i][m] = best;
        return best;
    }
}
```
