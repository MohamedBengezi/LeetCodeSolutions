    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int right = 0;
        int left = 0;
        if (root.right != null) right = maxDepth(root.right);
        if (root.left != null) left = maxDepth(root.left);
        return Math.max(right, left) + 1;
    }