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
    public int minDepth(TreeNode root) {

        if(root == null){
            return 0;
        }
        
       return getHeight(root); 
        
    }
    public int getHeight(TreeNode root ){
        if(root == null)
            return 0 ; 
        
        int leftHeight = 0 ; 
        int rightHeight = 0 ; 
        
        if(root.left!=null)
        leftHeight = getHeight(root.left); 
       
        if(root.right!= null)
        rightHeight = getHeight(root.right); 
        
        
        if(root.left==null){
            return rightHeight+1; 
        }
        
        if(root.right ==null) {
            return leftHeight+1; 
        }
        
        if(root.right!=null && root.left!= null && rightHeight < leftHeight){
            return rightHeight+1; 
        }
        
        return leftHeight+1; 
        
    }    
    
}