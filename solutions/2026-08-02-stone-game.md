# 877. Stone Game

**Difficulty:** Medium  
**Topics:** Array, Math, Dynamic Programming, Game Theory  
**Link:** https://leetcode.com/problems/stone-game/  
**Date:** 2026-08-02

---

## Approach
With an even number of piles, Alice can choose to target either all even-indexed or all odd-indexed piles by deciding to take from the left or right on her first move and then mirroring Bob’s choices. She picks the parity (even or odd indices) with the larger total sum, which is always possible due to optimal play and fixed parity positions. Since the total sum of stones is odd, there cannot be a tie, and Alice can always secure the higher sum. Therefore, Alice always wins.

## Complexity
- Time: O(1)
- Space: O(1)

## Solution
```java
class Solution {
    public boolean stoneGame(int[] piles) {
        return true;
    }
}
```
