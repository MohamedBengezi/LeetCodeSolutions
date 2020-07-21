class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];
        
        int n = nums.length;
        int[] output = new int[n - k + 1];
        int idx = 0;
        Deque<Integer> d = new ArrayDeque<>();
        for (int i= 0; i < n; i++) {
            while (!d.isEmpty() && d.peek() < i - k + 1) {
                d.poll();
            }
            while (!d.isEmpty() && nums[d.peekLast()] < nums[i]) {
                d.pollLast();
            }
            d.offer(i);
            
            if (i >= k - 1) output[idx++] = nums[d.peek()];
        }
                return output;

        }
        
}