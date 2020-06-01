class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int totLen = len1 + len2;
        
        //make the shorter array the main one
        if (len1 > len2) return findMedianSortedArrays(nums2, nums1);
        
        //initializing the low, high, and medianOfBoth variables
        int low = 0;
        int high = len1;
        int medianOfBoth = (len1 + len2 + 1)/2;
		
        //conducting a binary search to find the point where the left half of the first array is smaller than the right half of the second array and vice versa
        // this allows us to find the median of the combined array without actually combining them
        while (low <= high) {
            //partitions of the first and second array respectively. These separate the left and right halves
            int partition1 = (high + low)/2;
            int partition2 = medianOfBoth - partition1;
			
            //Finding the values directly to the left and right of each partition
            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = (partition1 == len1) ? Integer.MAX_VALUE : nums1[partition1];
            
            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = (partition2 == len2) ? Integer.MAX_VALUE : nums2[partition2];
			
            // if the left value of partition1 is <= the right value of partition2 AND the left value of partition2 is <= the right value of partition1, then we found the point
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
				
                //if the combined array is even, calculate the median by getting the average (using the max left value and min right value)
                if (totLen % 2 == 0) return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2))/2.0;
                
                //if odd, just return the bigger left value of the two arrays, since that will be the median
                else return Math.max(maxLeft1, maxLeft2);
            
            //too far to the right, so shift left
            } else if (maxLeft1 > minRight2) {
                high = partition1 - 1;
				
            //too far to the left, so shift right
            } else {
                low = partition1 + 1;
            }
            
        }
        //return 0 if no answer is found.
        return 0.0;
    }
}