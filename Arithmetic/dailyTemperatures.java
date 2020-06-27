class Solution {
    public int[] dailyTemperatures(int[] T) {
		// Need one slow pointer and one fast
        int slow, fast, n;
        n = T.length;
        slow = fast = 0;
        int[] ans = new int[n];
        
		// for each day in the week, increment `fast` until a hotter day appears or we reach the end of the array. 
        for (int i = 0; i < n; i++){
            int curDay = T[slow];
            int nextWarmest = 0;
            fast++;
            while (fast < n) {
                if (T[fast] > curDay) {
					//if we find a hotter day, nextWarmest is how many days between it and curDay
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