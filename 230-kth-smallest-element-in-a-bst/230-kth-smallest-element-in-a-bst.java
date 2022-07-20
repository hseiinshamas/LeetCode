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

    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> n = dfs(root , new ArrayList<Integer>());
        return n.get(k-1);
        
    }
    public ArrayList<Integer> dfs(TreeNode root ,ArrayList<Integer> list){
        if(root == null) return list ; 
        dfs(root.left, list );
        list.add(root.val);
        dfs(root.right, list);
        return list;
    }
}
