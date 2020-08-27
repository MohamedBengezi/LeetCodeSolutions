class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows <= 0) return list;
        
        List<Integer> tempList = new ArrayList<>();
        tempList.add(1);
        list.add(tempList);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = list.get(i-1); //get previous row
            tempList = new ArrayList<>();
            
            tempList.add(1);
            
            for (int j = 1; j< i; j++) {
                tempList.add(prev.get(j-1) + prev.get(j));
            }
            tempList.add(1);
            list.add(tempList);
            
        }
        
        return list;
    }
}