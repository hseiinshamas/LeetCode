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

    public ListNode mergeNodes(ListNode head) {
        ListNode zero = head;
        ListNode curr = head.next;

        while (curr != null) {
            if (curr.val != 0) {
                zero.val += curr.val;
            } else {
                if (curr.next == null) {
                    zero.next = null;
                } else {
                    zero.next = curr;
                }

                zero = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}
