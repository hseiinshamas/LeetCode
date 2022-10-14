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

    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;
        int count = 0;
        ListNode slow = head;
        ListNode fast = head;

        while (slow != null) {
            count++;
            slow = slow.next;
        }

        int mid = count / 2;
        for (int i = 0; i < mid - 1; i++) 
            fast = fast.next;

        fast.next = fast.next.next;
        return head;
    }
}
