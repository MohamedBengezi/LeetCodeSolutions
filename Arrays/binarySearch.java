class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        
        while (end >= start) {
            int middle = start + (end - start)/2;
            int val = nums[middle];
            if (val == target) return middle; 
            if (val > target) {
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }
        }
        return -1;
    }
}