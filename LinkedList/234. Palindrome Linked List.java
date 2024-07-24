/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s=new Stack<>();
        ListNode curr=head;
        int num=0;
        while(curr!=null){
            s.push(curr.val);
            curr=curr.next;
            num++;
        }

        curr=head;
        for(int i=0; i<num/2;i++){
            if(s.pop()!=curr.val){
                return false;
            }
            curr=curr.next;
        }
        return true;
    }
}