public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        /*if we reach the end of one list, point it to the other.
        this will subtract the differences between the list lengths 
        and ensure they reach the intersection at the same time*/
        while(a != b) {
            a = (a != null) ? a.next : headB;
            b = (b != null) ? b.next : headA;
        }
        return b;
        
        
//        //Alternative Solution: Place each node in A in a hashset, 
          //and check B for a node that exists in the set.
//         ListNode curr = headA;
//         ListNode compare = headB;
//         HashSet<ListNode> set = new HashSet<ListNode>(); 
        
//         ListNode intersect = null;
        
//         while (curr != null) {
//             set.add(curr);
//             curr = curr.next;
//         }
        
//         if (set.isEmpty()) return null;
        
//         while (compare != null) {
//             if (set.contains(compare)) return compare;
//             compare = compare.next;
//         }
//         return null;
     }
} 