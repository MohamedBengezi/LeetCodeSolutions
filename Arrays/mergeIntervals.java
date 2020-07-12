class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        ArrayList<int[]> merged = new ArrayList<int[]>();
                
   		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        
        int[] prevInterval = intervals[0];
        merged.add(prevInterval);
        for (int[] interval: intervals) {
            if (interval[0] <= prevInterval[1]) {
                prevInterval[1] = Math.max(prevInterval[1], interval[1]);
            } else {
                prevInterval = interval;
                merged.add(prevInterval);
            }
        }
        
        return merged.toArray(new int[merged.size()][]);

    }
}