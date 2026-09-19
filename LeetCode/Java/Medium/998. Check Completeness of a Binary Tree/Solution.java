class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<>();
        boolean isComplete=false;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode front=q.remove();
            if(front==null) isComplete=true;
            else{
                if(isComplete) return false;
                q.add(front.left);
                q.add(front.right);
            }
        }
        return true;
    }
}