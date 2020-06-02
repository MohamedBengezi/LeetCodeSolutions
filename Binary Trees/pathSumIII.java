class Solution {
    private int numPaths = 0;
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        
        return preorderSum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    
    public int preorderSum(TreeNode root, int remaining) {
        int count = 0;
        if (root == null) return 0;
        if (root.val == remaining) count++;
        
        count += preorderSum(root.left, remaining - root.val); 
        count += preorderSum(root.right, remaining - root.val);
        
        return count;

    }
    
}
