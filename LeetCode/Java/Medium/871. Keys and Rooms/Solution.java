class Solution {
    public void dfs(int start,List<List<Integer>> rooms,boolean[] visited){
        visited[start]=true;
        for(int ele:rooms.get(start)){
            if(!visited[ele]) dfs(ele,rooms,visited);
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited=new boolean[n];
        visited[0]=true;
        dfs(0,rooms,visited);
        for(boolean ele:visited){
            if(ele==false) return false;
        }
        return true;
    }
}