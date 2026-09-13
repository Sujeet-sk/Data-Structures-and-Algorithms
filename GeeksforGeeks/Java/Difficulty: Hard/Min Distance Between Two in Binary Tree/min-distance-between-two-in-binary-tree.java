/* A binary tree node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int distance(Node root,int a,int level){
        if(root==null) return 0;
        if(root.data==a) return level;
        int left=distance(root.left,a,level+1);
        int right=distance(root.right,a,level+1);
        if(left!=0) return left;
        return right;
        
    }
    public Node lowestCommonAncestor(Node root, int a, int b) {
        if(root==null) return null;
        if(root.data==a || root.data==b) return root;
        Node left=lowestCommonAncestor(root.left,a,b);
        Node right=lowestCommonAncestor(root.right,a,b);
        if(left!=null && right!=null) return root;
        return (left!=null) ? left:right;
    }
    public int findDist(Node root, int a, int b) {
        Node lca=lowestCommonAncestor(root,a,b);
        int left=distance(lca,a,0);
        int right=distance(lca,b,0);
        int min=left+right;
        return min;
        
    }
}