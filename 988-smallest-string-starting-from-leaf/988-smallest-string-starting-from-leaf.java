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

    public String smallestFromLeaf(TreeNode root) {
        if (root == null) return "";
        Deque<TreeNode> stack = new LinkedList();
        Deque<String> sumStack = new LinkedList();
        String smalleststr = "";
        char c = (char) (root.val + 97);
        stack.push(root);
        sumStack.push(c + "");
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            String val = sumStack.pop();
            if (node.left == null && node.right == null) {
                if (smalleststr.equals("")) smalleststr = val;
                if (val.compareTo(smalleststr) < 0) smalleststr = val;
            }
            if (node.left != null) {
                char ch = (char) (node.left.val + 97);
                sumStack.push(ch + val);
                stack.push(node.left);
            }
            if (node.right != null) {
                char ch = (char) (node.right.val + 97);
                sumStack.push(ch + val);
                stack.push(node.right);
            }
        }
        return smalleststr;
    }
}
