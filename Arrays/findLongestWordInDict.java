class Solution {
	public String findLongestWord(String s, List<String> d) {
        //sort by descending length
        Collections.sort(d, (a, b)->b.length() != a.length() ? b.length() - a.length() : a.compareTo(b));
        //first word that is a subsequence will be the longest, so return it
        for(String word : d){
            if(isSubsequence(s, word)){
                return word;
            }
        }
        return "";
    }
	
/* 	//alternative without sorting
	public String findLongestWord(String s, List<String> d) {
        String longest = "";
        //find longest subsequence by going through the whole dict
        for(String word : d){
            if(isSubsequence(s, word) && word.length() >= longest.length()){
                if (word.length() == longest.length()) longest = (word.compareTo(longest) < 0) ? word : longest;
                else longest = word;
            }
        }
        return longest;
    }
   */
    
    //if each letter matches then potential word is a subsequence.
    private boolean isSubsequence(String main, String potential){
        int idx = 0;
        for(char c : main.toCharArray()){
            if(idx == potential.length()) break;
            if(c == potential.charAt(idx)) idx++;
        }
        return idx == potential.length();
    }
}