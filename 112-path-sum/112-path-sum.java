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
    public boolean hasPathSum(TreeNode root, int targetSum) {
      
     if(root == null){
         return false; 
     }
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> sumStack = new Stack(); 
      
        
        stack.push(root); 
        sumStack.push(targetSum- root.val); 
     
        while(!stack.isEmpty()){

          TreeNode current = stack.pop(); 
          int sum = sumStack.pop(); 
      
            if(current.left == null && current.right == null && sum ==0){
                return true; 
      }
      
        if(current.left!=null){
            stack.push(current.left); 
            sumStack.add(sum - current.left.val); 
        }
        
          if(current.right!=null){
            stack.push(current.right); 
            sumStack.add(sum - current.right.val); 
        }
      }
          return false; 
  }
    
}