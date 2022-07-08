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
   private List<Integer> list;
    
    public TreeNode increasingBST(TreeNode root) {
        list = new ArrayList<>();
        inOrderTraverse(root);
        
        TreeNode answer = new TreeNode(list.get(0));
        TreeNode current = answer;
        
        int i = 1;
        while(i < list.size()) {
            current.right = new TreeNode(list.get(i));
            current = current.right;
            i++;
        }
        
        return answer;
    }
    
    public void inOrderTraverse(TreeNode node) {
        if(node == null) {
            return;
        }

        inOrderTraverse(node.left);

        list.add(node.val);
        
        inOrderTraverse(node.right);
    }
}