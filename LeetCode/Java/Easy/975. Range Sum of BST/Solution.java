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
    public int rangeSumBST(TreeNode root, int low, int high) {
        TreeNode temp=root;
        if(root==null) return 0;
        if(temp.val<low) return rangeSumBST(temp.right,low,high);
        else if(temp.val>high) return rangeSumBST(temp.left,low,high);
        else return temp.val+rangeSumBST(temp.right,low,high)+rangeSumBST(temp.left,low,high);
    }
}