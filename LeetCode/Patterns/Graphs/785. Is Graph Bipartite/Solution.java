class Solution {
    static boolean isbipartite;
    public void bfs(int i,int[] visited,int[][] graph){
        visited[i]=0;
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int front=q.remove();
            int color=visited[front];
            for(int ele:graph[front]){
                if(visited[ele]==visited[front]){
                    isbipartite=false;
                    return;
                }
                if(visited[ele]==-1){
                    visited[ele]=1-color;
                    q.add(ele);
                }
            }
        }
    }

    public boolean isBipartite(int[][] graph) {
        isbipartite=true;
        int n=graph.length;
        int[] visited=new int[n];
        Arrays.fill(visited,-1);
        for(int i=0;i<n;i++){
            if(visited[i]==-1) bfs(i,visited,graph);
            if(!isbipartite) return isbipartite;
        }
        return isbipartite;
    }
}