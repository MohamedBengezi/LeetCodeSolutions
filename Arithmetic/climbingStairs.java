class Solution {
    public int climbStairs(int n) {
        //Manually calculating the n+1'th fib number
        int t1 = 0, t2 = 1;

        for (int i = 0; i < n; i++)
        {
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        
        return t2;
        
        // //ALTERNATIVE: using the formula for fibonacci sequence
        // double constant = 1/Math.sqrt(5);
        // double fibNum = constant*(Math.pow((1+Math.sqrt(5))/2, n+1) - Math.pow((1-Math.sqrt(5))/2, n+1));
        // return (int)fibNum;
    }
}