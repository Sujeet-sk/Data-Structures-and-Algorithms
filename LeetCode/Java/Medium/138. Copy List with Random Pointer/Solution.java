class Solution {
    public Node deepcopy(Node head){
        Node dummy=new Node(-1);
        Node t=dummy;
        Node temp=head;
        while(temp!=null){
            Node newNode=new Node(temp.val);
            t.next=newNode;
            t=t.next;
            temp=temp.next;
        }
        return dummy.next;
    }
    public Node copyRandomList(Node head){
        if(head==null) return null;
        Node clone=deepcopy(head);

        HashMap<Node,Node>map=new HashMap<>();
        Node t1=head;
        Node c1=clone;
        while(t1!=null){
            map.put(t1,c1);
            t1=t1.next;
            c1=c1.next;
        }

        t1=head;
        while(t1!=null){
            map.get(t1).random=map.get(t1.random);
            t1=t1.next;
        }
        return clone;
    }
}