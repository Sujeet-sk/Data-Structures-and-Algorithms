/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        Stack<Node>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            Node top=st.pop();
            ans.add(top.data);
            if(top.right!=null) st.push(top.right);
            if(top.left!=null) st.push(top.left);
        }
        return ans;
    }
}