/* A Tree node
class Node {
    int data;
    Node left, right;

    Node(int x) {
        left = right = null;
        data = x;
    }
}*/

class Solution {
    public void path(Node root,int sum,ArrayList<Integer>arr,ArrayList<ArrayList<Integer>>ans){
        if(root==null) return;
        arr.add(root.data);
        if(root.data==sum){
            ArrayList<Integer>copy=new ArrayList<>();
            copy.addAll(arr);
            ans.add(copy);
        }
        path(root.left,sum-root.data,arr,ans);
        path(root.right,sum-root.data,arr,ans);
        arr.remove(arr.size()-1);
    }
    public ArrayList<ArrayList<Integer>> printPaths(Node root, int sum) {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>arr=new ArrayList<>();
        path(root,sum,arr,ans);
        return ans;
        
    }
}