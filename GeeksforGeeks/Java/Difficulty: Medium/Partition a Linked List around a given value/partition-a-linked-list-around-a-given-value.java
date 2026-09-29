/* Structure of linked list Node
class Node {
  public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = null;
    }
};
*/
class Solution {
    public Node partition(Node head, int x) {
        if(head.next==null) return head;
        Node dummy1=new Node(-1);
        Node dummy2=new Node(-1);
        Node dummy3=new Node(-1);
        Node t=head;
        Node t1=dummy1;
        Node t2=dummy2;
        Node t3=dummy3;
        while(t!=null){
            if(t.data<x){
                t1.next=t;
                t1=t1.next;
            }
            else if(t.data==x){
                t3.next=t;
                t3=t3.next;
            }
            else{
                t2.next=t;
                t2=t2.next;
            }
            t=t.next;
        }
        
        if(t3.data!=(-1)){
            t1.next=dummy3.next;
            t3.next=dummy2.next;
        }
        else t1.next=dummy2.next;
        t2.next=null;
        
        return dummy1.next;
    }
}