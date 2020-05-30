class Solution {
    public int maxProfit(int[] prices) {
        //intialize lowest price to a high value.
        int low = Integer.MAX_VALUE;
        int profit = -1;
        //loop through, check if current price is a new low, and check if a new max profit is hit
        for (int i : prices) {
            if (i < low) {
                low = i;
            }
            if (i - low > profit) profit = i - low;
        }
        
        if (profit < 0) return 0;
        else return profit;
    }
}