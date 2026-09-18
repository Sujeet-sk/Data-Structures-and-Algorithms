class Pair{
    Node node;
    int hd;
    
    Pair(Node node,int hd){
        this.node=node;
        this.hd=hd;
    }
}
class Solution {
    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer>ans=new ArrayList<>();
        TreeMap<Integer,Integer>map=new TreeMap<>();
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair front=q.remove();
            int hd=front.hd;
            if(!map.containsKey(hd)) map.put(hd,front.node.data);
            if(front.node.left!=null) q.add(new Pair(front.node.left,hd-1));
            if(front.node.right!=null) q.add(new Pair(front.node.right,hd+1));
        }
        
        for(int ele:map.keySet()) ans.add(map.get(ele));
        return ans;
    }
}