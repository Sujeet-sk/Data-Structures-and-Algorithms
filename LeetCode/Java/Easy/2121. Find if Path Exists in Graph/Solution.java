class Solution {
    public void bfs(int source,List<List<Integer>>adj,boolean[] visited){
        Queue<Integer>q=new LinkedList<>();
        q.add(source);
        while(!q.isEmpty()){
            int front=q.remove();
            for(int ele:adj.get(front)){
                if(!visited[ele]){
                    q.add(ele);
                    visited[ele]=true;
                }
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
       // if(source==destination) return true;
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>list=new ArrayList<>();
            adj.add(list);
        }
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0],b=edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean[] visited=new boolean[n];
        visited[source]=true;
        bfs(source,adj,visited);
        return visited[destination];
    }
}