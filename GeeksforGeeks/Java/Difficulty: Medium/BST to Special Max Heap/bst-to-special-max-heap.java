class Solution {
    static int idx;
    public static void inorder(Node root,ArrayList<Integer>ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
    public static void postorder(Node root,ArrayList<Integer>ans){
        if(root==null) return;
        postorder(root.left,ans);
        postorder(root.right,ans);
        root.data=ans.get(idx++);
    }
    public static void convertToMaxHeap(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        idx=0;
        inorder(root,ans);
        postorder(root,ans);
    }
}