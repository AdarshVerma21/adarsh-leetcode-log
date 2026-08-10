# 1510. Stone Game IV

**Difficulty:** Hard  
**Topics:** Math, Dynamic Programming, Minimax, Game Theory, Nim Game, Sprague–Grundy Theorem, Zero-Sum Game  
**Link:** https://leetcode.com/problems/stone-game-iv/  
**Date:** 2026-08-10

---

## Approach
Use dynamic programming. Let dp[i] indicate whether the current player has a winning strategy with i stones. The transition is: dp[i] is true if there exists a perfect square s ≤ i such that dp[i − s] is false (i.e., the current player can move to a losing position for the opponent). Initialize dp[0] = false. Precompute all squares up to n to iterate efficiently, and fill dp from 1 to n.

## Complexity
- Time: O(n * sqrt(n))
- Space: O(n)

## Solution
```java
class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        int m = (int) Math.sqrt(n);
        int[] squares = new int[m];
        for (int i = 1; i <= m; i++) {
            squares[i - 1] = i * i;
        }

        for (int i = 1; i <= n; i++) {
            for (int s : squares) {
                if (s > i) break;
                if (!dp[i - s]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
```
