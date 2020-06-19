public boolean canBalance(int[] nums) {
  int left = 0, right = nums.length - 1, sum = 0;
  int sumLeft = 0, sumRight = 0;
  while (left <= right) {
      if (sumLeft == sumRight) {
          sumLeft += nums[left++];
          sumRight += nums[right--];
      }
      else if (sumLeft > sumRight) {
          sumRight += nums[right--];

      } else sumLeft += nums[left++];

  }
  return (sumLeft == sumRight) && (--left < ++right);
}      