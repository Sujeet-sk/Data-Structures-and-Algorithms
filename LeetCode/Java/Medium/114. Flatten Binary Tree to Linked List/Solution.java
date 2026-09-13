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
    public void preorder(TreeNode root,ArrayList<TreeNode>ans){
        if(root==null) return;
        ans.add(root);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
    public void flatten(TreeNode root) {
        if(root==null) return;
        ArrayList<TreeNode>ans=new ArrayList<>();
        preorder(root,ans);
        for(int i=0;i<ans.size()-1;i++){
            TreeNode a=ans.get(i);
            TreeNode b=ans.get(i+1);
            a.right=b;
            a.left=null;
        }
        TreeNode a=ans.get(ans.size()-1);
        a.right=null;
        a.left=null;
    }
}