class Solution {
    public int[] productExceptSelf(int[] nums) {
        //base case
        if (nums.length == 2) return new int[]{nums[1], nums[0]};
        
        int[] output = new int[nums.length];
        output[0] = 1;
        //loop once and set output[i] to be the product of all elements to the left
        for (int i = 1; i < nums.length; i++) {
            output[i] = nums[i-1] * output[i-1];
        }
        
        //use r as the product of all elements to the right, initially 1. loop right to left and multiply r by output[i]
        // to get the product of all elements other than nums[i]
        int r = 1;
        for (int i = nums.length - 1; i>=0; i--) {
            output[i] = output[i] * r;
            r *= nums[i];
        }
        return output;
        
    }
}