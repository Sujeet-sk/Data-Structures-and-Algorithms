/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;
    public Node(int d) {
     data = d;
     left = right = null;
   }
} */
class Quad{
    int max;
    int min;
    int size;
    boolean isBST;
    
    Quad(int max,int min,int size,boolean isBST){
        this.max=max;
        this.min=min;
        this.size=size;
        this.isBST=isBST;
    }
}
class Solution {
    int maxSize;
    public Quad helper(Node root){
        if(root==null) return new Quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);
        Quad lft=helper(root.left);
        Quad rgt=helper(root.right);
        int max=Math.max(root.data,Math.max(lft.max,rgt.max));
        int min=Math.min(root.data,Math.min(lft.min,rgt.min));
        int size=1+lft.size+rgt.size;
        boolean isBST=lft.isBST && rgt.isBST && (lft.max<root.data) && (rgt.min>root.data);
        if(isBST) maxSize=Math.max(maxSize,size);
        return new Quad(max,min,size,isBST);
    }
    public int largestBst(Node root) {
        maxSize=0;
        helper(root);
        return maxSize;
    }
}