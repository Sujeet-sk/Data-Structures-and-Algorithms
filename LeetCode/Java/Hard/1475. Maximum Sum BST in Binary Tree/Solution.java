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
class Quad{
    int max;
    int min;
    int sum;
    boolean isBST;

    Quad(int max,int min,int sum,boolean isBST){
        this.max=max;
        this.min=min;
        this.sum=sum;
        this.isBST=isBST;
    }
}
class Solution {
    int maxSum;
    public Quad helper(TreeNode root){
        if(root==null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);
        Quad lft=helper(root.left);
        Quad rgt=helper(root.right);
        int max=Math.max(root.val,Math.max(lft.max,rgt.max));
        int min=Math.min(root.val,Math.min(lft.min,rgt.min));
        int sum=root.val+lft.sum+rgt.sum;
        boolean isBST=lft.isBST && rgt.isBST && (lft.max<root.val) && (rgt.min>root.val);
        if(isBST) maxSum=Math.max(maxSum,sum);
        return new Quad(max,min,sum,isBST);
    }
    public int maxSumBST(TreeNode root) {
        maxSum=0;
        helper(root);
        return maxSum;
    }
}
