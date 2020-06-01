class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int maxLen = 0;
        
        for (int i = 0; i < s.length(); i++){
            int len1 = expandFromCenter(s, i, i); //expand from a central letter, e.g. racecar expands about the 'e'
            int len2 = expandFromCenter(s, i, i+1); //expand from two central letters, e.g. aabbaa
            int len = Math.max(len1, len2); //pick the result with the bigger palindrome
            
            //if we found a new longest one, update the length, and start/end indices
            if (len > maxLen) {
                maxLen = len;
                start = i - (len - 1)/2;
                end = i + len/2 + 1;
            }   
        }
        return s.substring(start, end);
    }
    
    //helper function checks for palindromes by beginning at the characters located at left and right, checks if they are equal, and expands.
    private int expandFromCenter(String s, int left, int right) {
        if (s == null || left > right) return 0;
        
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}