# 3310. Remove Methods From Project

**Difficulty:** Medium  
**Topics:** Depth-First Search, Breadth-First Search, Graph Theory  
**Link:** https://leetcode.com/problems/remove-methods-from-project/  
**Date:** 2026-08-05

---

## Approach
Treat methods as nodes in a directed graph where an edge a -> b means method a invokes method b. First, find all suspicious methods: all nodes reachable from k (including k) via outgoing edges using DFS/BFS. Then check if there exists any edge from a non-suspicious node to a suspicious node; if such an edge exists, removal is not allowed and we must return all methods. Otherwise, remove the suspicious set and return the remaining methods.

## Complexity
- Time: O(n + m), where m = invocations.length
- Space: O(n + m)

## Solution
```java
import java.util.*;

class Solution {
    public int[] remainingMethods(int n, int k, int[][] invocations) {
        // Build adjacency list for outgoing edges
        List<Integer>[] g = new ArrayList[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
        for (int[] e : invocations) {
            g[e[0]].add(e[1]);
        }

        // Find all suspicious methods: reachable from k
        boolean[] suspicious = new boolean[n];
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(k);
        suspicious[k] = true;
        while (!stack.isEmpty()) {
            int u = stack.pop();
            for (int v : g[u]) {
                if (!suspicious[v]) {
                    suspicious[v] = true;
                    stack.push(v);
                }
            }
        }

        // Check if any method outside suspicious invokes a suspicious one
        for (int[] e : invocations) {
            int a = e[0], b = e[1];
            if (!suspicious[a] && suspicious[b]) {
                // Cannot remove any suspicious methods
                int[] all = new int[n];
                for (int i = 0; i < n; i++) all[i] = i;
                return all;
            }
        }

        // Remove suspicious methods and return the remaining
        int cnt = 0;
        for (int i = 0; i < n; i++) if (!suspicious[i]) cnt++;
        int[] ans = new int[cnt];
        int idx = 0;
        for (int i = 0; i < n; i++) if (!suspicious[i]) ans[idx++] = i;
        return ans;
    }
}
```
