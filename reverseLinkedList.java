public ListNode reverseList(ListNode head) {
	//Iterative
	ListNode previous = null;
	ListNode curr = head;
	while (curr != null) {
		ListNode tmp = curr.next;
		curr.next = previous;
		previous = curr;
		curr = tmp;
	}
	return previous;
	
	
	// //Recursive
	// if (head == null || head.next == null) return head;
	// ListNode previous = reverseList(head.next);
	// head.next.next = head;
	// head.next = null;
	// return previous;
}