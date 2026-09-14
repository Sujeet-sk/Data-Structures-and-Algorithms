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
    public TreeNode construct(int prelo,int prehi,int postlo,int posthi,int[] preorder,int[] postorder){
        if(prelo>prehi) return null;
        int r=preorder[prelo];
        TreeNode root=new TreeNode(r);
        if(prelo==prehi) return root;
        int ele=preorder[prelo+1];
        int idx=-1;
        for(int i=postlo;i<=posthi;i++){
            if(postorder[i]==ele){
                idx=i;
                break;
            }
        }
        int cnt=idx-postlo+1;
        root.left=construct(prelo+1,prelo+cnt,postlo,idx,preorder,postorder);
        root.right=construct(prelo+cnt+1,prehi,idx+1,posthi-1,preorder,postorder);
        return root;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int n=preorder.length;
        TreeNode ans=construct(0,n-1,0,n-1,preorder,postorder);
        return ans;
    }
}