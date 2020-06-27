class Solution {
    public int[] dailyTemperatures(int[] T) {
        int slow, fast, n;
        n = T.length;
        slow = fast = 0;
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++){
            int curDay = T[slow];
            int nextWarmest = 0;
            fast++;
            while (fast < n) {
                if (T[fast] > curDay) {
                    nextWarmest = fast - slow;
                    break;
                } 
                fast++;
            }
            ans[slow++] = nextWarmest;
            fast = slow; 
            
        }
        return ans;
    }
}