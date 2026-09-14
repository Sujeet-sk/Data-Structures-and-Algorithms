/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Node>st=new Stack<>();
        Node curr=root;
        while(curr!=null || st.size()>0){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            ans.add(curr.data);
            curr=curr.right;
        }
        
        return ans;
    }
}