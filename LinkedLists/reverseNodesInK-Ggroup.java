class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode begin;
        if (head==null || head.next ==null || k==1)
            return head;
        ListNode dummyhead = new ListNode(-1);
        dummyhead.next = head;
        begin = dummyhead;
        int i=0;
        while(head != null){
            i++;
            ListNode next = head.next; //cache p.next!
            if(i % k == 0){
                begin = reverse(begin, next);
            }
            head = next;
        }
        return dummyhead.next;

    }

    public ListNode reverse(ListNode begin, ListNode end){
        ListNode head = begin.next, curr = head, prev = begin;
        ListNode next;
        while(curr!=end){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        begin.next = prev;
        head.next = curr;
        return head;
        
        
    }
} 