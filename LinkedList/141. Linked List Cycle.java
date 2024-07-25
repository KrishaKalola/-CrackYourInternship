/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
         if (head == null){
            return false;
        }

        ListNode h1 = head;
        ListNode h2 = head;
        while (h1 != null && h1.next != null){
            h1 = h1.next.next;
            h2 = h2.next;
            if (h1 == h2){
                return true;
            }
        }
        return false;
    }
}