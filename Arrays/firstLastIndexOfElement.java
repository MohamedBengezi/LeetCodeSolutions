class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ret = {-1, -1};
        if (n == 0) return ret;
        int start = 0, end = n;
        
        while (start < end) {
            int mid = start + (end - start)/2;
            if (nums[mid] < target) start = mid + 1;
            else end = mid;
        }
        if (start == nums.length || nums[start] != target) {
            return ret;
        } else ret[0] = start;

        // Search for the right one
        end = n-1;  // We don't have to set i to 0 the second time.
        while (start < end)
        {
            int mid = (start + end) /2 + 1;	// Make mid biased to the right
            if (nums[mid] > target) end = mid - 1;  
            else start = mid;				// So that this won't make the search range stuck.
        }
        ret[1] = end;
        
        return ret;
    }
    
}