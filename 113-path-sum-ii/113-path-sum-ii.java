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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      
        List<List<Integer>> res = new ArrayList<>();
         f(root, targetSum, new ArrayList<>(), res);
        return res;
        
    }
    private void f(TreeNode root, int target , List<Integer>list , List<List<Integer>>res){
        if(root == null) 
           return ;
        
        list.add(root.val);
        
        if(root.left == null && root.right == null && target == root.val)
            res.add(new ArrayList<>(list)); 
        else {
            if(root.left!= null) f(root.left, target - root.val, list, res);
            if(root.right!= null) f(root.right, target - root.val, list ,res);
        }
        
        list.remove(list.size() - 1);
    }
}