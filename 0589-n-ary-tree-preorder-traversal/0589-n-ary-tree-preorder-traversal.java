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
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }
    
    public void traverse(Node current, List<Integer> list) {
        if(current == null) return;
        
        list.add(current.val);
        for(int i = 0; i < current.children.size(); i++) {
            traverse(current.children.get(i), list);
        }
    }
}