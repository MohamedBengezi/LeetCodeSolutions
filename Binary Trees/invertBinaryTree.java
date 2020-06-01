public TreeNode invertTree(TreeNode root) {
	//Iterative solution
	if (root == null) return root;
	Queue<TreeNode> toBeChecked = new LinkedList<TreeNode>();
	//add root node to queue
	toBeChecked.add(root);
	while (!toBeChecked.isEmpty()) {
		//pop first node in queue and add non-null children
		TreeNode curr = toBeChecked.poll();
		if (curr.left != null) toBeChecked.add(curr.left);
		if (curr.right != null) toBeChecked.add(curr.right);
		//switch the nodes
		TreeNode tmp = curr.left;
		curr.left = curr.right;
		curr.right = tmp;
	}
	return root;
	
	
	// Recursive solution
	// if (root == null) return root;
	// if (root.left != null) invertTree(root.left);
	// if (root.right != null) invertTree(root.right);
	// TreeNode tmp = root.right;
	// root.right = root.left;
	// root.left = tmp;
	// return root;

}