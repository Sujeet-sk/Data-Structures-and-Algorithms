/* Binary Tree Node Structure
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Solution {
    public static void preorder(Node root,ArrayList<Node>ans){
        if(root==null) return;
        ans.add(root);
        preorder(root.left,ans);
        preorder(root.right,ans);
    }
    public static void flatten(Node root) {
        ArrayList<Node>ans=new ArrayList<>();
        preorder(root,ans);
        for(int i=0;i<ans.size()-1;i++){
            Node a=ans.get(i);
            Node b=ans.get(i+1);
            
            a.right=b;
            a.left=null;
        }
        Node a=ans.get(ans.size()-1);
        a.left=null;
        a.right=null;
    }
}