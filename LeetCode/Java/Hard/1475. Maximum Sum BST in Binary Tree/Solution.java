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
    boolean isBST;
    int sum;

    Quad(int max, int min, boolean isBST, int sum){
        this.max=max;
        this.min=min;
        this.isBST=isBST;
        this.sum=sum;
    }
}
class Solution {
    static int maxSum;
    public int maxSumBST(TreeNode root) {
        maxSum=0;
        maxMin(root);
        return maxSum;
    }

    Quad maxMin(TreeNode root){
        if(root==null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,true,0);
        Quad lft=maxMin(root.left);
        Quad rgt=maxMin(root.right);
        int max=Math.max(root.val,Math.max(lft.max,rgt.max));
        int min=Math.min(root.val,Math.min(lft.min,rgt.min));
        boolean isBST=lft.isBST && rgt.isBST && (lft.max<root.val) && (rgt.min>root.val);
        int sum=root.val+lft.sum+rgt.sum;
        if(isBST) maxSum=Math.max(sum,maxSum);
        return new Quad(max,min,isBST,sum);
    }
}
