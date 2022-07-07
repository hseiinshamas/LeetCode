/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
     //   4      1       1      9
      //  4 ---> 5 --- > 1 ---> 9  Delete node 2 . 
        ListNode prev = null; 
        ListNode curr = node; 
        curr.val  = curr.next.val ;
        prev = curr.next.next; 
        curr.next = prev; 
    }
}