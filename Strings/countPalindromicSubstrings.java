class Solution {
    public int countSubstrings(String s) {
        int ans = 0;
        int n = 2 * s.length()-1; //num of possible 'middles'
        
        for (int i = 0; i <= n; i++) {
            int left = i/2;
            int right = left + i % 2;
            ans += expandFromCenter(s, left, right);
        }
        
        return ans;
        
    }
    
        //helper function checks for palindromes by beginning at the characters located at left and right, checks if they are equal, and expands. returns the number of palindromes found
    private int expandFromCenter(String s, int left, int right) {
        if (s == null || left > right) return 0;
        int ans = 0;
        
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            ans++;
            left--;
            right++;
        }
        return ans;
    }
}