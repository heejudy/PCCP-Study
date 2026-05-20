/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @param {number} k
 * @return {number}
 */
var kthSmallest = function (root, k) {
    let count = 0;
    let result = 0;

    if (root === null) return;

    function dfs(node) {

        if (node.left !== null) {
            dfs(node.left);
        }
        count++;
        if (count === k) {
            result = node.val;
            return;
        }
        if (node.right !== null) {
            dfs(node.right);

        }
    }

    dfs(root);
    return result;

};
