class Solution {
    public int pathSum(TreeNode root,int[] max){
        if(root==null) return 0;
        int leftLineSum=pathSum(root.left,max);
        int rightLineSum=pathSum(root.right,max);
        int sum=root.val+leftLineSum+rightLineSum;
        max[0]=Math.max(max[0],sum);
        return root.val+Math.max(0,Math.max(leftLineSum,rightLineSum));
    }
    public int maxPathSum(TreeNode root) {
        int[] max={Integer.MIN_VALUE};
        pathSum(root,max);
        return max[0];
    }
}