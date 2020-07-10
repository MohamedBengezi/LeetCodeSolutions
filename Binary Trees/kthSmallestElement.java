class Solution {
    //using DFS Inorder traversal to find the kthSmallest element
    public int kthSmallest(TreeNode root, int k) {
        //stack to keep track of left nodes
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        
        while (true) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.removeLast();
            if (--k == 0) return root.val;
            root = root.right;
        }
    }
}