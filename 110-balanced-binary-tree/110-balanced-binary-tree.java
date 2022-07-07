/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
    
        if(root == null)
            return true; 
        return (balanced(root) != -1); 
       
       
    }
    public int balanced(TreeNode root){
        if(root == null)
            return 0; 
        
        int left= balanced(root.left); 
        int right = balanced(root.right); 
        
        if(right == -1)
            return -1; 
        
        if(left == -1)
            return -1; 
        
        
        if(Math.abs(left - right)  > 1){
            return -1; 
            
            
        }
        return (Math.max(right, left) +1); 
    }
}