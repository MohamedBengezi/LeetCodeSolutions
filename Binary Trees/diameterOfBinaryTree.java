class Solution {
    int diameter = 0;
    //main method, add 1 for the diameter (root node), get the max diameter, and subtract 1 to get the number of edges
    public int diameterOfBinaryTree(TreeNode root) {
        diameter += 1;
        height(root);
        return diameter - 1;
    }
    
	//get heights of left and right side recursively, set diameter equal to the sum of left and right
    private int height(TreeNode root) {
        if (root == null) return 0;
        int right = height(root.right);
        int left = height(root.left);
        diameter = Math.max(diameter, left + right + 1);
        return Math.max(left, right) + 1;
    }
}