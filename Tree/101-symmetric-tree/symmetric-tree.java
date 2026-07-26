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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        TreeNode invertedTree = SwappedSubTree(root.left);
    
        return isSame(root.left,root.right);

    }
    public TreeNode SwappedSubTree(TreeNode node){
        if (node == null) return null;
        
        TreeNode temp= node.left;
        node.left=node.right;
        node.right=temp;
        SwappedSubTree(node.left);
        SwappedSubTree(node.right);

        return node;
    }
    public boolean isSame(TreeNode p, TreeNode q){
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        
        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }
    }