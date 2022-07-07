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
    public TreeNode sortedArrayToBST(int[] nums) {
       
        if(nums.length ==0){
            return null; 
        }
      
        return constructBST(nums,0,nums.length-1); 
        
        }
    public TreeNode constructBST(int [] nums , int l , int r){
        if(l > r){
            return null; 
        }
        
        int midpt = l + (r-l) /2 ; 
        
        TreeNode node = new TreeNode(nums[midpt]); 
        
        node.left = constructBST(nums, l, midpt-1); 
        node.right = constructBST(nums, midpt+1, r); 
        
        return node; 
        
    }
    
}

