/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null){
            return head;
        }
        
        Node curr = head;
        Stack<Node> stack = new Stack<>();
        while(curr != null){
            if(curr.child != null){
                if(curr.next != null){
                    stack.push(curr.next);
                }
             
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
            }
   
            if (curr.next == null && !stack.isEmpty()){
                curr.next = stack.pop();
                curr.next.prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}