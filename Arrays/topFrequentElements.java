class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) return nums;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));
        int[] ans =  new int[k];
        
        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1 );
        }

        // use heap to keep track of top k frequent keys
        for (int i: map.keySet()) {
          heap.add(i);
          if (heap.size() > k) heap.poll();    
        }

        //output
        for(int i = k - 1; i >= 0; --i) ans[i] = heap.poll();
        return ans;
    }
}