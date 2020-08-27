class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
		//to keep track of which indices are determined as dictionary words
        boolean[] f = new boolean[s.length() + 1];
        
        f[0] = true;
        
        for(int i=1; i <= s.length(); i++){
            for(int j=0; j < i; j++){
                if(f[j] && wordDict.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
            }
        }
        //only need to check last element in boolean array since we're using DP
        return f[s.length()];
    }
}