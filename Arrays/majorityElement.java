public int majorityElement(int[] nums) {
// 	//using a HashMap
// 	 HashMap<Integer, Integer> hash_table = new HashMap<>();
// 	 for (int i : nums) {
// 		 hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
// 	 }

// 	 for (int i: nums) {
// 		 if (hash_table.get(i) > nums.length/2) return i;
// 	 }
// 	 return 0;
	 
	 //sorting. since > n/2 elements will be the same, the majorityElement will always be at n/2 in a sorted array
	Arrays.sort(nums);
	return nums[nums.length/2];
}