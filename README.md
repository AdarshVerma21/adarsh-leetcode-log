# Adarsh LeetCode Log 🚀

A structured collection of my LeetCode problem-solving journey, containing solutions to Data Structures and Algorithms (DSA) problems solved regularly to improve problem-solving skills, coding consistency, and interview preparation.

This repository tracks my progress in mastering DSA concepts for software engineering and AI engineering interviews.

---

# 📌 About This Repository

This repository contains:

* ✅ LeetCode problem solutions
* ✅ DSA practice questions
* ✅ Optimized coding approaches
* ✅ Problem-solving patterns
* ✅ Daily coding consistency
* ✅ Interview preparation solutions

The main goal of this repository is to build strong problem-solving skills while maintaining a consistent coding streak.

---

# 🛠 Languages Used

* Java ☕
* Python 🐍
* C++ 💻 *(optional if added later)*

---

# 📂 Repository Structure

```bash
adarsh-leetcode-log/
│
├── Arrays/
├── Strings/
├── HashMap/
├── LinkedList/
├── Stack/
├── Queue/
├── Trees/
├── Graphs/
├── Dynamic Programming/
├── Greedy/
└── README.md
```

---

# 🎯 Topics Covered

This repository focuses on:

* Arrays
* Strings
* Hashing
* Recursion
* Linked Lists
* Stacks & Queues
* Trees & Binary Trees
* Graph Algorithms
* Sliding Window
* Two Pointers
* Dynamic Programming
* Greedy Algorithms
* Searching & Sorting

---

# 🚀 Why This Repository?

This repository helps me:

* Strengthen DSA fundamentals
* Prepare for coding interviews
* Improve coding consistency
* Track daily progress
* Learn optimized solutions
* Build discipline through daily practice

---

# 📈 Coding Goals

Current focus areas:

* 🔥 Solve LeetCode problems daily
* 📚 Complete NeetCode 150
* 💡 Improve problem-solving speed
* 🧠 Master core DSA concepts
* 🚀 Prepare for internships and placements

---

# 🧩 Example Problem

## Contains Duplicate

### Problem Statement

Given an integer array `nums`, return `true` if any value appears at least twice in the array.

### Java Solution

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
```

### Time Complexity

```bash
O(n)
```

### Space Complexity

```bash
O(n)
```

---

# 🏆 Progress Tracking

* ✅ Daily LeetCode practice
* ✅ DSA revision
* ✅ Interview preparation
* ✅ Coding streak maintenance

---

# 🌟 Future Improvements

Planned upgrades for this repository:

* Add explanations for each problem
* Add optimized approaches
* Include time & space complexity
* Add multiple language solutions
* Organize problems by difficulty
* Add notes for interview patterns

---

# 🤝 Contributing

Contributions and suggestions are welcome!

If you'd like to improve this repository:

1. Fork the repository
2. Create a new branch
3. Commit your changes
4. Push your changes
5. Open a Pull Request

---

# 📄 License

This project is licensed under the MIT License.

---

# 👨‍💻 Author

Created by Adarsh Verma.

If you found this repository useful, consider giving it a ⭐ on GitHub.

<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
|  |
| ------- |
| [0001-two-sum](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0001-two-sum) |
| [0011-container-with-most-water](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0015-3sum) |
| [0026-remove-duplicates-from-sorted-array](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0027-remove-element](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0027-remove-element) |
| [0035-search-insert-position](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0035-search-insert-position) |
| [0036-valid-sudoku](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0036-valid-sudoku) |
| [0049-group-anagrams](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0049-group-anagrams) |
| [0066-plus-one](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0066-plus-one) |
| [0075-sort-colors](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0075-sort-colors) |
| [0088-merge-sorted-array](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0088-merge-sorted-array) |
| [0108-convert-sorted-array-to-binary-search-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0108-convert-sorted-array-to-binary-search-tree) |
| [0121-best-time-to-buy-and-sell-stock](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0121-best-time-to-buy-and-sell-stock) |
| [0128-longest-consecutive-sequence](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0128-longest-consecutive-sequence) |
| [0136-single-number](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0136-single-number) |
| [0167-two-sum-ii-input-array-is-sorted](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0167-two-sum-ii-input-array-is-sorted) |
| [0169-majority-element](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0169-majority-element) |
| [0217-contains-duplicate](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0217-contains-duplicate) |
| [0347-top-k-frequent-elements](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0347-top-k-frequent-elements) |
| [0349-intersection-of-two-arrays](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0349-intersection-of-two-arrays) |
| [0350-intersection-of-two-arrays-ii](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0350-intersection-of-two-arrays-ii) |
| [0705-design-hashset](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0705-design-hashset) |
| [0706-design-hashmap](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0706-design-hashmap) |
| [0912-sort-an-array](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0912-sort-an-array) |
| [1929-concatenation-of-array](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/1929-concatenation-of-array) |
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0001-two-sum) |
| [0036-valid-sudoku](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0036-valid-sudoku) |
| [0049-group-anagrams](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0049-group-anagrams) |
| [0128-longest-consecutive-sequence](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0128-longest-consecutive-sequence) |
| [0141-linked-list-cycle](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0141-linked-list-cycle) |
| [0169-majority-element](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0169-majority-element) |
| [0217-contains-duplicate](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0217-contains-duplicate) |
| [0242-valid-anagram](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0242-valid-anagram) |
| [0347-top-k-frequent-elements](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0347-top-k-frequent-elements) |
| [0349-intersection-of-two-arrays](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0349-intersection-of-two-arrays) |
| [0350-intersection-of-two-arrays-ii](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0350-intersection-of-two-arrays-ii) |
| [0424-longest-repeating-character-replacement](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0424-longest-repeating-character-replacement) |
| [0567-permutation-in-string](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0567-permutation-in-string) |
| [0705-design-hashset](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0705-design-hashset) |
| [0706-design-hashmap](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0706-design-hashmap) |
## Two Pointers
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0015-3sum) |
| [0026-remove-duplicates-from-sorted-array](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0027-remove-element](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0027-remove-element) |
| [0028-find-the-index-of-the-first-occurrence-in-a-string](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0028-find-the-index-of-the-first-occurrence-in-a-string) |
| [0075-sort-colors](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0075-sort-colors) |
| [0088-merge-sorted-array](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0088-merge-sorted-array) |
| [0125-valid-palindrome](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0125-valid-palindrome) |
| [0141-linked-list-cycle](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0141-linked-list-cycle) |
| [0167-two-sum-ii-input-array-is-sorted](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0167-two-sum-ii-input-array-is-sorted) |
| [0349-intersection-of-two-arrays](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0349-intersection-of-two-arrays) |
| [0350-intersection-of-two-arrays-ii](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0350-intersection-of-two-arrays-ii) |
| [0567-permutation-in-string](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0567-permutation-in-string) |
## Binary Search
|  |
| ------- |
| [0035-search-insert-position](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0035-search-insert-position) |
| [0069-sqrtx](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0069-sqrtx) |
| [0167-two-sum-ii-input-array-is-sorted](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0167-two-sum-ii-input-array-is-sorted) |
| [0349-intersection-of-two-arrays](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0349-intersection-of-two-arrays) |
| [0350-intersection-of-two-arrays-ii](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0350-intersection-of-two-arrays-ii) |
## Sorting
|  |
| ------- |
| [0015-3sum](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0015-3sum) |
| [0049-group-anagrams](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0049-group-anagrams) |
| [0075-sort-colors](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0075-sort-colors) |
| [0088-merge-sorted-array](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0088-merge-sorted-array) |
| [0169-majority-element](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0169-majority-element) |
| [0217-contains-duplicate](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0217-contains-duplicate) |
| [0242-valid-anagram](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0242-valid-anagram) |
| [0347-top-k-frequent-elements](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0347-top-k-frequent-elements) |
| [0349-intersection-of-two-arrays](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0349-intersection-of-two-arrays) |
| [0350-intersection-of-two-arrays-ii](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0350-intersection-of-two-arrays-ii) |
| [0912-sort-an-array](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0912-sort-an-array) |
## String
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0020-valid-parentheses) |
| [0028-find-the-index-of-the-first-occurrence-in-a-string](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0028-find-the-index-of-the-first-occurrence-in-a-string) |
| [0049-group-anagrams](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0049-group-anagrams) |
| [0058-length-of-last-word](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0058-length-of-last-word) |
| [0125-valid-palindrome](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0125-valid-palindrome) |
| [0171-excel-sheet-column-number](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0171-excel-sheet-column-number) |
| [0242-valid-anagram](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0242-valid-anagram) |
| [0424-longest-repeating-character-replacement](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0424-longest-repeating-character-replacement) |
| [0567-permutation-in-string](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0567-permutation-in-string) |
## Stack
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0020-valid-parentheses) |
| [0094-binary-tree-inorder-traversal](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0094-binary-tree-inorder-traversal) |
| [0144-binary-tree-preorder-traversal](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0145-binary-tree-postorder-traversal) |
| [0155-min-stack](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0155-min-stack) |
## Linked List
|  |
| ------- |
| [0021-merge-two-sorted-lists](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0021-merge-two-sorted-lists) |
| [0083-remove-duplicates-from-sorted-list](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0083-remove-duplicates-from-sorted-list) |
| [0141-linked-list-cycle](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0141-linked-list-cycle) |
| [0206-reverse-linked-list](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0206-reverse-linked-list) |
| [0705-design-hashset](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0705-design-hashset) |
| [0706-design-hashmap](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0706-design-hashmap) |
## Recursion
|  |
| ------- |
| [0021-merge-two-sorted-lists](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0021-merge-two-sorted-lists) |
| [0206-reverse-linked-list](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0206-reverse-linked-list) |
## Math
|  |
| ------- |
| [0009-palindrome-number](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0009-palindrome-number) |
| [0066-plus-one](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0066-plus-one) |
| [0069-sqrtx](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0069-sqrtx) |
| [0070-climbing-stairs](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0070-climbing-stairs) |
| [0171-excel-sheet-column-number](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0171-excel-sheet-column-number) |
## Greedy
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0011-container-with-most-water) |
## String Matching
|  |
| ------- |
| [0028-find-the-index-of-the-first-occurrence-in-a-string](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0028-find-the-index-of-the-first-occurrence-in-a-string) |
## Bit Manipulation
|  |
| ------- |
| [0136-single-number](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0136-single-number) |
## Dynamic Programming
|  |
| ------- |
| [0070-climbing-stairs](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0070-climbing-stairs) |
| [0121-best-time-to-buy-and-sell-stock](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0121-best-time-to-buy-and-sell-stock) |
## Memoization
|  |
| ------- |
| [0070-climbing-stairs](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0070-climbing-stairs) |
## Simulation
|  |
| ------- |
| [1929-concatenation-of-array](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/1929-concatenation-of-array) |
## Matrix
|  |
| ------- |
| [0036-valid-sudoku](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0036-valid-sudoku) |
## Divide and Conquer
|  |
| ------- |
| [0108-convert-sorted-array-to-binary-search-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0108-convert-sorted-array-to-binary-search-tree) |
| [0169-majority-element](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0169-majority-element) |
| [0347-top-k-frequent-elements](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0347-top-k-frequent-elements) |
| [0912-sort-an-array](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0912-sort-an-array) |
## Counting
|  |
| ------- |
| [0169-majority-element](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0169-majority-element) |
| [0347-top-k-frequent-elements](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0347-top-k-frequent-elements) |
## Design
|  |
| ------- |
| [0155-min-stack](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0155-min-stack) |
| [0705-design-hashset](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0705-design-hashset) |
| [0706-design-hashmap](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0706-design-hashmap) |
## Hash Function
|  |
| ------- |
| [0705-design-hashset](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0705-design-hashset) |
| [0706-design-hashmap](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0706-design-hashmap) |
## Heap (Priority Queue)
|  |
| ------- |
| [0347-top-k-frequent-elements](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0347-top-k-frequent-elements) |
| [0912-sort-an-array](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0912-sort-an-array) |
## Merge Sort
|  |
| ------- |
| [0912-sort-an-array](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0912-sort-an-array) |
## Bucket Sort
|  |
| ------- |
| [0347-top-k-frequent-elements](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0347-top-k-frequent-elements) |
| [0912-sort-an-array](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0912-sort-an-array) |
## Radix Sort
|  |
| ------- |
| [0912-sort-an-array](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0912-sort-an-array) |
## Counting Sort
|  |
| ------- |
| [0912-sort-an-array](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0912-sort-an-array) |
## Quickselect
|  |
| ------- |
| [0347-top-k-frequent-elements](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0347-top-k-frequent-elements) |
## Union-Find
|  |
| ------- |
| [0128-longest-consecutive-sequence](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0128-longest-consecutive-sequence) |
## Sliding Window
|  |
| ------- |
| [0424-longest-repeating-character-replacement](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0424-longest-repeating-character-replacement) |
| [0567-permutation-in-string](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0567-permutation-in-string) |
## Tree
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0094-binary-tree-inorder-traversal) |
| [0100-same-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0101-symmetric-tree) |
| [0104-maximum-depth-of-binary-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0104-maximum-depth-of-binary-tree) |
| [0108-convert-sorted-array-to-binary-search-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0108-convert-sorted-array-to-binary-search-tree) |
| [0110-balanced-binary-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0110-balanced-binary-tree) |
| [0144-binary-tree-preorder-traversal](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0145-binary-tree-postorder-traversal) |
## Depth-First Search
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0094-binary-tree-inorder-traversal) |
| [0100-same-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0101-symmetric-tree) |
| [0104-maximum-depth-of-binary-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0104-maximum-depth-of-binary-tree) |
| [0110-balanced-binary-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0110-balanced-binary-tree) |
| [0144-binary-tree-preorder-traversal](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0145-binary-tree-postorder-traversal) |
## Binary Tree
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0094-binary-tree-inorder-traversal) |
| [0100-same-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0101-symmetric-tree) |
| [0104-maximum-depth-of-binary-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0104-maximum-depth-of-binary-tree) |
| [0108-convert-sorted-array-to-binary-search-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0108-convert-sorted-array-to-binary-search-tree) |
| [0110-balanced-binary-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0110-balanced-binary-tree) |
| [0144-binary-tree-preorder-traversal](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0144-binary-tree-preorder-traversal) |
| [0145-binary-tree-postorder-traversal](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0145-binary-tree-postorder-traversal) |
## Breadth-First Search
|  |
| ------- |
| [0100-same-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0100-same-tree) |
| [0101-symmetric-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0101-symmetric-tree) |
| [0104-maximum-depth-of-binary-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0104-maximum-depth-of-binary-tree) |
## Binary Search Tree
|  |
| ------- |
| [0108-convert-sorted-array-to-binary-search-tree](https://github.com/adarsh-verma-ai/adarsh-leetcode-log/tree/master/0108-convert-sorted-array-to-binary-search-tree) |
<!---LeetCode Topics End-->