/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public void leftBoundary(Node root,ArrayList<Integer>ans){
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        ans.add(root.data);
        if(root.left!=null) leftBoundary(root.left,ans);
        else leftBoundary(root.right,ans);
    }
    public void leafNodes(Node root,ArrayList<Integer>ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            ans.add(root.data);
        }
        leafNodes(root.left,ans);
        leafNodes(root.right,ans);
    }
    public void rightBoundary(Node root,ArrayList<Integer>ans){
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        if(root.right!=null) rightBoundary(root.right,ans);
        else rightBoundary(root.left,ans);
        ans.add(root.data);
    }
    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        if(root.left==null && root.right==null){
            ans.add(root.data);
            return ans;
        }
        ans.add(root.data);
        leftBoundary(root.left,ans);
        leafNodes(root,ans);
        rightBoundary(root.right,ans);
        
        return ans;
        
    }
}