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

class Solution 
{
    public boolean isSameTree(TreeNode p, TreeNode q) 
    {
        int a = 0;
        int b = 0;

        if(p == null && q == null)
        {
            return true;
        }
        else if(p == null && q != null)
        {
            return false;
        }
        else if(p != null && q == null)
        {
            return false;
        }
        else
        {
            a = p.val;
            b = q.val;
            
        }

        return (a == b) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
