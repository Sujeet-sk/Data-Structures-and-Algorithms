/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean search(Node root, int key) {
        Node temp=root;
        while(temp!=null){
            if(temp.data==key) return true;
            else if(temp.data>key) temp=temp.left;
            else temp=temp.right;
        }
        return false;
    }
}