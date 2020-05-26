public void moveZeroes(int[] nums) {
	int count = 0;
	for (int i = 0; i < nums.length; i++){
		System.out.println(nums[i]);
		if (nums[i] != 0){
			nums[count++] = nums[i];
		}
	}
	
	for (;count < nums.length; count++){
		nums[count] = 0;
	}
}