class Solution {
    public boolean isCompleteTree(Node root) {
        Queue<Node>q=new LinkedList<>();
        boolean isComplete=false;
        q.add(root);
        while(!q.isEmpty()){
            Node front=q.remove();
            if(front==null) isComplete=true;
            else{
                if(isComplete) return false;
                q.add(front.left);
                q.add(front.right);
            }
        }
            return true;
        }
    public boolean isMaxHeap(Node root){
        if(root==null) return true;
        int left=(root.left!=null)? root.left.data:Integer.MIN_VALUE;
        int right=(root.right!=null)? root.right.data:Integer.MIN_VALUE;
        if(root.data<left || root.data<right) return false;
        return isMaxHeap(root.left) && isMaxHeap(root.right);
        
    }
    public boolean isHeap(Node tree) {
        return isCompleteTree(tree)&& isMaxHeap(tree);
    }
}