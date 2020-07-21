class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) start = mid + 1;
            else end = mid;
        }
        
        int r = start;
        start = 0;
        end = nums.length -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midd = (mid + r) % nums.length;
            if (nums[midd] == target) return midd;
            if (nums[midd] < target) start = mid + 1;
            else end = mid - 1;
        }
        
        return -1;
    }
}