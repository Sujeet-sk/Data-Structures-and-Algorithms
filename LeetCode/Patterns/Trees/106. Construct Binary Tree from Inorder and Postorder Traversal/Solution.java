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
    public TreeNode construct(int postlo,int posthi,int inlo,int inhi,int[] postorder,int[] inorder){
        if(postlo>posthi) return null;
        int r=postorder[posthi];
        TreeNode root=new TreeNode(r);
        int idx=-1;
        for(int i=inlo;i<=inhi;i++){
            if(inorder[i]==r){
                idx=i;
                break;
            }
        }
        int cnt=idx-inlo;
        root.left=construct(postlo,postlo+cnt-1,inlo,idx-1,postorder,inorder);
        root.right=construct(postlo+cnt,posthi-1,idx+1,inhi,postorder,inorder);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        TreeNode ans=construct(0,n-1,0,n-1,postorder,inorder);
        return ans;
    }
}