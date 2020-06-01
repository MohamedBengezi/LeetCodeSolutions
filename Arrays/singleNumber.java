  public int singleNumber(int[] nums) {
    int diff = 0;
    for (int i : nums) {
        diff ^= i;
    }
    return diff;
  }