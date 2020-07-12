class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        //sort string element, check if in map, and add to appropriate key,value pair
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedStr = String.valueOf(chars);
            if (!ans.containsKey(sortedStr)) ans.put(sortedStr, new ArrayList());
            //add element to corresponding sortedStr key
            ans.get(sortedStr).add(s);
        }
        
        return new ArrayList(ans.values());
    }
    
}