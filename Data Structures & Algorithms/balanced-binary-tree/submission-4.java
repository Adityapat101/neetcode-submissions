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
    public boolean isBalanced(TreeNode root) 
    {
        int l = 0; 
        int r = 0;

        if (root == null)
        {
            return true;
        }
        else
        {
             l += getHeight(root.left);
             r += getHeight(root.right);
        }

        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(l - r) <= 1;
    }

    public int getHeight(TreeNode root)
    {   
        int l = 0;
        int r = 0;

        if (root == null)
        {
            return 0;
        }
        else
        {
            l = getHeight(root.left);
            r = getHeight(root.right);
        }

        return 1 + Math.max(l,r);
    }
}
