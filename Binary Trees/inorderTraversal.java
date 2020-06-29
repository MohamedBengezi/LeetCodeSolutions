class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        //Using a stack since we need LIFO
        Stack<TreeNode> s = new Stack<TreeNode>();
        List<Integer> ans = new ArrayList<Integer>();
        TreeNode curr = root;
        
        /* Go left until we find the leftmost node, add to the list, and
        do the same with the right branch */
        while (!s.isEmpty() || curr != null) {
            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            ans.add(curr.val);
            curr = curr.right;
        }
        return ans;
    }
}