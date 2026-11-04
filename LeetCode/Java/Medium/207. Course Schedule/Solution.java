class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>>al=new ArrayList<>();
        for(int i=0;i<numCourses;i++) al.add(new ArrayList<>());
        int[] indegree=new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            int a= prerequisites[i][0],b=prerequisites[i][1];
            al.get(b).add(a);
            indegree[a]++;
        }

        //Kahn's Algorithm
        Queue<Integer>q=new LinkedList<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int front=q.remove();
            ans.add(front);
            for(int ele:al.get(front)){
                indegree[ele]--;
                if(indegree[ele]==0) q.add(ele);
            }
        }

        return ans.size()==numCourses;
    }
}