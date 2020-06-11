public int maxSpan(int[] nums) {
  int max = 1;
  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
  boolean visited[] =  new boolean[nums.length];
  
  if (nums.length == 0) return 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (map.containsKey(nums[i])){
      int span = i - map.getOrDefault(nums[i],0) + 1;
      if (span > max) max = span;
    } else {
      map.put(nums[i], i); 
    }
  }
  return max;
}
