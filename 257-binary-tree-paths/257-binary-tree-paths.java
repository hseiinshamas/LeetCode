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

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        Stack<TreeNode> sNode = new Stack<TreeNode>();
        Stack<String> sStr = new Stack<String>();

        if (root == null) return list;
        sNode.push(root);
        sStr.push("");
        while (!sNode.isEmpty()) {
            TreeNode curNode = sNode.pop();
            String curStr = sStr.pop();

            if (curNode.right != null) {
                sNode.push(curNode.right);
                sStr.push(curStr + curNode.val + "->");
            }

            if (curNode.left == null && curNode.right == null) 
                list.add(curStr + curNode.val);

            if (curNode.left != null) {
                sNode.push(curNode.left);
                sStr.push(curStr + curNode.val + "->");
            }
        }

        return list;
    }
}
