class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head, prev = null, newHead = new ListNode(-1);
        newHead.next = head;
        prev = newHead;
        
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }         
        return newHead.next;
    }
}

