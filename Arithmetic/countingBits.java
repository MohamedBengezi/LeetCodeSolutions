class Solution {
    public int[] countBits(int num) {
        int[] binaryRep = new int[num + 1];
        
        for (int i = 0; i < num + 1; i++) {
            binaryRep[i] = numOnes(i);
        }
        return binaryRep;
    }
    
    private int numOnes(int num) {
        int cnt = 0;
        while (num > 0) {
            int rmdr = num % 2;
            num = num/2;
            if (rmdr == 1) cnt++;
            if (num == 1) { 
                break;
            }
        }
        return cnt;
    }
    
}