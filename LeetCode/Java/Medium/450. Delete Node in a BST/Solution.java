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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val>key) root.left=deleteNode(root.left,key);
        else if(root.val<key) root.right=deleteNode(root.right,key);
        else{   //root.val==key
            //0 child Node
            if(root.left==null && root.right==null) return null;

            //1 child Node
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            //2 child Node
            else{
                TreeNode pred=root.left;
                while(pred.right!=null) pred=pred.right;
                root.left=deleteNode(root.left,pred.val);
                pred.left=root.left;
                pred.right=root.right;
                return pred;
            }
        }
        return root;
    }
}