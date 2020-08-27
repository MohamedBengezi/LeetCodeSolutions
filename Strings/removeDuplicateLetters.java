public class Solution {
    public String removeDuplicateLetters(String s) {

        int[] res = new int[26]; // will contain number of occurences of character (i+'a')
        boolean[] visited = new boolean[26]; // will contain if character ('a' + i) is present in current result Stack
        char[] ch = s.toCharArray();
        for (char c : ch) { // count number of occurences of character
            res[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder(); // answer stack
        int index;
        for (char c : ch) {
            index = c - 'a';
            res[index]--;
            if (visited[index]) continue;
            
            while ((sb.length() > 0) && c < sb.charAt(sb.length() - 1) && res[sb.charAt(sb.length()-1)-'a']!=0) {
                visited[sb.charAt(sb.length() - 1) - 'a'] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(c);
            visited[index] = true;
        }
        
        return sb.toString();
    }
}