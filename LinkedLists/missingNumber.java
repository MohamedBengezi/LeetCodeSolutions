class Solution {
    public int missingNumber(int[] nums) {
        //using bit manipulation
        int res = nums.length;
        for(int i=0; i<nums.length; i++){
            res = res ^ i ^ nums[i]; // a^b^b = a
        }
        return res;
        
        
        //using boolean array
        //         int n = nums.length;
//         boolean[] missing = new boolean[n+1];
        
//         for (int i = 0; i < n; i++) {
//             missing[nums[i]] = true;
//         }
        
//         for (int i = 0; i < n + 1; i++) {
//             if (!missing[i]) return i;
//         }
//         return -1;
    }
}