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

        int[] status = new int[2];

        traverse(root, k, status);

        return status[1];
    }

    private void traverse(TreeNode node, int k, int[] status) {
        if (node == null) {
            return;
        }

        traverse(node.left, k, status);

        status[0]++;
        if (status[0] == k) {
            status[1] = node.val;
            return;
        }

        if (status[0] < k) {
            traverse(node.right, k, status);
        }
    }
}