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
    public TreeNode construct(int prelo,int prehi,int inlo,int inhi,int[] preorder,int[] inorder){
        if(prelo>prehi) return null;
        int r=preorder[prelo];
        TreeNode root=new TreeNode(r);
        int idx=-1;
        for(int i=inlo;i<=inhi;i++){
            if(inorder[i]==r){
                idx=i;
                break;
            }
        }
        int cnt=idx-inlo;
        root.left=construct(prelo+1,prelo+cnt,inlo,idx-1,preorder,inorder);
        root.right=construct(prelo+cnt+1,prehi,idx+1,inhi,preorder,inorder);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] copy=preorder.clone();
        Arrays.sort(copy);
        int[] inorder=copy;
        int n=preorder.length;
        TreeNode ans=construct(0,n-1,0,n-1,preorder,inorder);
        return ans;
    }
}