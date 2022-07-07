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
    public int findSecondMinimumValue(TreeNode root) {
       
        if(root == null)
            return -1; 
        
    
       
        Queue<TreeNode> queue = new LinkedList<>();
        Set<Integer> s = new HashSet<>();
        List<Integer> a = new ArrayList<>();
       
        queue.add(root);
       
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
           
             if (!s.contains(curr.val)) {
                a.add(curr.val);
            }
            s.add(curr.val);
            if(curr.left!=null)queue.add(curr.left); 
            if(curr.right!=null)queue.add(curr.right);
            
            
        }
       
          Collections.sort(a);
        
        if(a.size()>=2)
            return a.get(1);
        
        return -1; 
    }
}