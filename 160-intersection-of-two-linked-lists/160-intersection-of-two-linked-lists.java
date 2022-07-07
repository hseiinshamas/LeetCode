/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
      Set<ListNode> nodes = new HashSet<>(); 
        
        while(headA!=null){
            nodes.add(headA);  // ex2 : we added 4 1 8 4 5 to the hashset. 
            headA = headA.next; 
        }
        
        while(headB!=null){ // 5 6 1 8 4 5 
           
            if(nodes.contains(headB)){

                return headB; 
            }
        
        headB = headB.next; 
        }
       
        return null; 
            
    }
}