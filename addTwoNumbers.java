public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry = 0;
    ListNode p = l1;
    ListNode q = l2;
    
    ListNode head = new ListNode(0);
    ListNode result = new ListNode(0);
    int index = 0;
    
    while(p != null || q != null){
        int x = p.val;
        int y = q.val;
        int sum = carry + x + y;
        carry = sum / 10;
        result.next = new ListNode(sum%10);
        result = result.next;
        if (index == 0){
            head = result;
        }
        
        index++;
         if (p != null) p = p.next;
         if (q != null) q = q.next;            

   }
    if (carry > 0)
        result.next = new ListNode(carry);
    
    return head;
}