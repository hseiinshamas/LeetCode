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
   int sum; 
    public int sumEvenGrandparent(TreeNode root) {
        
   sum = 0;
    helper(root, null, null);
    return sum;
        
    }
    
   
  
  private void helper(TreeNode root, TreeNode parent, TreeNode grandparent) {
    if (root == null) {
      return;
    }
    if (grandparent != null && grandparent.val % 2 == 0) {
      sum += root.val;
    }
    helper(root.left, root, parent);
    helper(root.right, root, parent);
    }
}