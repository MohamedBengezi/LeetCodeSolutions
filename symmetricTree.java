//Iterative solution
class Solution {    
    public boolean isSymmetric(TreeNode root) {
		boolean isSym = true;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode r = queue.poll();
            TreeNode l = queue.poll();
            if (r == null && l == null) continue;
            if (r == null || l == null) { isSym = false; break; }
            if (r.val != l.val) { isSym = false; break; }
            queue.add(r.left);
            queue.add(l.right);
            queue.add(r.right);
            queue.add(l.left);
        }
        return isSym;
        
    }
    
}


//Recursive Solution
/* class Solution {
    boolean isSym;
    
    public boolean isSymmetric(TreeNode root) {
        isSym = true;
        height(root, root);
        return isSym;
        
    }
    
    private boolean height(TreeNode right, TreeNode left) {
        if (right == null && left == null) {
            isSym = true;
            return isSym;
        } 
        else if (right == null || left == null) return false;
        
        boolean same = right.val == left.val;
        boolean r = height(right.right, left.left);
        boolean l = height(right.left, left.right);
        
        isSym = same && l && r ;
        return isSym;
    }
} */