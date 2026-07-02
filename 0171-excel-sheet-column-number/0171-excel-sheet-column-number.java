class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char c : columnTitle.toCharArray()) {
            int digit = c - 'A' + 1;  // A=1, B=2, ..., Z=26
            result = result * 26 + digit;
        }
        return result;
    }
}