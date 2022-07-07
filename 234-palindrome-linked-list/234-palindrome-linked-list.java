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
  
        if(head == null || head.next==null)
        return true;
 
    //find list center
    ListNode fast = head;
    ListNode slow = head;
 
    while(fast.next!=null && fast.next.next!=null){
        fast = fast.next.next;
        slow = slow.next;
    }
 
    ListNode secondHead = slow.next;
    slow.next = null;
 
    //reverse second part of the list
    ListNode p1 = secondHead;
    ListNode p2 = p1.next;
 
    while(p1!=null && p2!=null){
        ListNode temp = p2.next;
        p2.next = p1;
        p1 = p2;
        p2 = temp;
    }
 
    secondHead.next = null;
 
    //compare two sublists now
    ListNode p = (p2==null?p1:p2);
    ListNode q = head;
    while(p!=null){
        if(p.val != q.val)
            return false;
 
        p = p.next;
        q = q.next;
 
    }
 
    return true;
    }
}