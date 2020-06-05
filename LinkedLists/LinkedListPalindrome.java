class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head; 
        boolean isPalindrome = true; 
        Stack<Integer> stack = new Stack<Integer>(); 
        //push each node's value to the stack
        while (slow != null) { 
            stack.push(slow.val); 
            slow = slow.next; 
        } 
        /* if you go through and pop each element in the stack, you'll get the list backwards
         ompare this the linkedlist to see if each letter is the same */
        while (head != null) { 
            int i = stack.pop(); 
            if (head.val == i) { 
                isPalindrome = true; 
            } 
            else { 
                isPalindrome = false; 
                break; 
            } 
            head = head.next; 
        } 
        return isPalindrome; 
    }
}