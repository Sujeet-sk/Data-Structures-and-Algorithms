class Solution {
    static boolean ans;
    public void dfs(int i,ArrayList<ArrayList<Integer>>al,boolean[] visited,boolean[] path){
        visited[i]=true;
        path[i]=true;
        for(int ele:al.get(i)){
            if(path[ele]==true){
                ans=false;
                return;
            }
            if(!visited[ele]) dfs(ele,al,visited,path);
        }
        path[i]=false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ans=true;
        ArrayList<ArrayList<Integer>>al=new ArrayList<>();
        for(int i=0;i<numCourses;i++) al.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++){
            int a= prerequisites[i][0],b=prerequisites[i][1];
            al.get(b).add(a);
        }
        boolean[] visited=new boolean[numCourses];
        boolean[] path=new boolean[numCourses];
        for(int i=0;i<numCourses;i++) dfs(0,al,visited,path);
        return ans;
    }
}