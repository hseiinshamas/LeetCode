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
 *         this.right = right;  add to the queue only integers that are within the range
 *     }
 * }
 */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
     
    /*    int sum  = 0 ;  iterative

       
        if(root == null)
            return 0; 
        
        
        Queue<TreeNode> queue = new LinkedList<>(); 
        queue.add(root);
        
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll(); // 10 
            if(curr.val>=low && curr.val <= high)
                sum+= curr.val;
            
            if(curr.left!=null)queue.add(curr.left);
            if(curr.right!=null)queue.add(curr.right);
        }
        return sum; 
        */
        
        
        if (root == null) return 0; // recursion
    
        if (root.val < low) return rangeSumBST(root.right, low, high);
        if (root.val > high) return rangeSumBST(root.left, low, high);
        return root.val + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low,high);
    }
}