class Solution {
    public void bfs(int i,boolean[] visited,int[][] isConnected){
        int n=isConnected.length;
        visited[i]=true;
        Queue<Integer>q=new LinkedList<>();
        q.add(i);
        while(!q.isEmpty()){
            int front=q.remove();
            for(int j=0;j<n;j++){
                if(isConnected[front][j]==1 && visited[j]==false){
                    q.add(j);
                    visited[j]=true;
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                bfs(i,visited,isConnected);
                count++;
            }
        }
        return count;
    }
}