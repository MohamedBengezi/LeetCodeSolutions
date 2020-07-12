class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<Node, Node>();
        
        Node curNode = head;
        
        while(curNode != null){
            map.put(curNode, new Node(curNode.val));
            curNode = curNode.next;
        }
        
        curNode = head;
        
        while(curNode != null){
            map.get(curNode).next = map.get(curNode.next);
            map.get(curNode).random = map.get(curNode.random);
            curNode = curNode.next;
        }
        
        return map.get(head);
    }
}