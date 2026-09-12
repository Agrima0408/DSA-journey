class Solution {
    private int matchingNodeCount = 0;

    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return matchingNodeCount;
    }

    // Returns array: [subtree_sum, node_count]
    private int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        int currentSum = node.val + left[0] + right[0];
        int currentCount = 1 + left[1] + right[1];

        // Rounding down is handled automatically by integer division
        if (currentSum / currentCount == node.val) {
            matchingNodeCount++;
        }

        return new int[]{currentSum, currentCount};
    }
}