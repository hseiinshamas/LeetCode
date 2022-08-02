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
    public int deepestLeavesSum(TreeNode root) {
        int sum = 0 ; 
        Queue<TreeNode> queue = new LinkedList<>(); 
        if(root == null) return sum ;
        
        queue.add(root); 
        
        while(!queue.isEmpty()){
            sum = 0 ; 
            int size = queue.size(); 
            for(int i = 0 ; i < size ; i++){
            TreeNode curr = queue.poll();
                sum += curr.val;
                if(curr.left!=null) queue.offer(curr.left); 
                if(curr.right!=null) queue.offer(curr.right); 
            }
        }
        return sum ;
    }
}