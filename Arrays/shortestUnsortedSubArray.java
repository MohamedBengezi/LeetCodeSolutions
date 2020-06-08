class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        
        while (left <= right) {
            if (nums[left] == sorted[left]) left++;
            else if (nums[right] == sorted[right]) right--;
            else break;
        }
        if (left == right) return 0;
        return right - left + 1;
        
    }
}