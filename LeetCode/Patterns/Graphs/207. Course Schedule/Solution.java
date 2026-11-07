class Solution {
    public boolean dfs(int i,ArrayList<ArrayList<Integer>>al,boolean[] visited,boolean[] path){
        visited[i]=true;
        path[i]=true;
        for(int ele:al.get(i)){
            if(path[ele]==true) return false;
            if(!visited[ele]){
                if(!dfs(ele,al,visited,path)) return false;
            }
        }
        path[i]=false;

        return true;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>al=new ArrayList<>();
        for(int i=0;i<numCourses;i++) al.add(new ArrayList<>());
        for(int i=0;i<prerequisites.length;i++){
            int a= prerequisites[i][0],b=prerequisites[i][1];
            al.get(b).add(a);
        }
        boolean[] visited=new boolean[numCourses];
        boolean[] path=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(!dfs(i,al,visited,path)) return false;
            }
        }
        return true;
    }
}