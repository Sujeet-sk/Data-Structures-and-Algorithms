/* Linked List Node Structure
class Node { 
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node c=head;
        Node p=null;
        Node f=null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p;
    }
    
    public Node reverseCircular(Node head) {
        if(head.next==head) return head;
        Node temp=head;
        while(temp.next!=head) temp=temp.next;
        temp.next=null;
        Node reversed=reverse(head);
        Node r=reversed;
        while(r.next!=null) r=r.next;
        r.next=reversed;
        
        return reversed;
    }
}