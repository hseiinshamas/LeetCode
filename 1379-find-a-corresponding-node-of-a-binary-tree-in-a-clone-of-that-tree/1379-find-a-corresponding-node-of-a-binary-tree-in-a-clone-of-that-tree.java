/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.LinkedList;
import java.util.Queue;
class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
   Queue<TreeNode> queue  = new LinkedList<>();
		        queue.add(cloned);
		        
		        while(!queue.isEmpty()){
		      TreeNode current= queue.poll(); 
		            if(current.val == target.val){
		                return current; 
		            }
		            if(current.left!= null) queue.add(current.left); 
		            if(current.right!= null) queue.add(current.right); 
		            
		        }
		        return null ; 
    }
}