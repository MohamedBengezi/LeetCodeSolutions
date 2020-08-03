class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currA = l1, currB = l2, head = new ListNode(-1), ans = head;
        int carry = 0;
        
        while (currA != null || currB != null) {
            int a = (currA != null) ? currA.val : 0;
            int b = (currB != null) ? currB.val : 0;
            
            int sum = carry + a + b;
            carry = sum / 10;
            sum = sum % 10;

            ans.next = new ListNode(sum);
            ans = ans.next;
            currA = (currA != null) ? currA.next : null;
            currB = (currB != null) ? currB.next : null;
        }
        
        if (carry > 0) {
            ans.next = new ListNode(carry);
        }
        
        return head.next;
    }
}