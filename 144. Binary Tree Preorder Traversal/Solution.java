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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        TreeNode current = root;
        stack.push(root);
        while (root != null && !stack.isEmpty()) {
            current = stack.pop();
            if (current != null) {
            list.add(current.val);
            stack.push(current.right);
            stack.push(current.left);
            }
        }
        
        
        return list;
        
    }
}
