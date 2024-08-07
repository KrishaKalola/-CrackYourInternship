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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode h1 = reverse(l1);
        ListNode h2 = reverse(l2);
        ListNode temp = new ListNode(0);
        ListNode t = temp;
        int c = 0;
        while(h1 != null || h2!=null || c!=0){
            int sum = 0;
            if(h1!= null){
                sum+=h1.val;
                h1=h1.next;
            }
            if(h2!= null){
                sum+=h2.val;
                h2=h2.next;
            }
            sum+=c;
            c = sum/10;
            ListNode node = new ListNode(sum % 10);
            t.next = node;
            t = t.next;
        }
        t.next = null;
        temp = temp.next;
        ListNode ans = reverse(temp);
        return ans;
    }
    private ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode res = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
}