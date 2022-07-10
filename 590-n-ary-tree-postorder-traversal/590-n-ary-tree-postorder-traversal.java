/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) return list;
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        
        while(!stack.isEmpty()){
            Node curr = stack.pop();
            list.add(curr.val);
            
            for(Node child : curr.children)
                stack.add(child);
            
        }
        Collections.reverse(list);
        return list;
    }
}
