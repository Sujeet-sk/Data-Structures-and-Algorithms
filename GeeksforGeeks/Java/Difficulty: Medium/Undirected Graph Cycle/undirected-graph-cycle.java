class Pair{
    int node;
    int parent;
    
    Pair(int node,int parent){
        this.node=node;
        this.parent=parent;
    }
}

class Solution {
    public boolean bfs(int i,boolean[] visited,ArrayList<ArrayList<Integer>> adj){
        int n=adj.size();
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(i,-1));
        visited[i]=true;
        while(!q.isEmpty()){
            Pair front=q.remove();
            int node=front.node;
            int parent=front.parent;
            for(int ele:adj.get(node)){
                if(!visited[ele]){
                    q.add(new Pair(ele,node));
                    visited[ele]=true;
                }
                else if(ele!=parent) return true;
            }
        }
        return false;
    }
    
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int n=adj.size();
        boolean[] visited =new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(bfs(i,visited,adj)) return true;
            }
        }
        return false;
    }
}