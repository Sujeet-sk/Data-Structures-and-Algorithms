class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
       ArrayList<ArrayList<Integer>>al=new ArrayList<>();
        for(int i=0;i<numCourses;i++) al.add(new ArrayList<>());
        int[] indegree=new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            int a=prerequisites[i][0],b=prerequisites[i][1];
            al.get(b).add(a);
            indegree[a]++;
        }

        //kahn's Algorithm
        Queue<Integer>q=new LinkedList<>();
        int[] ans=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0) q.add(i);
        }
        int idx=0;
        while(!q.isEmpty()){
            int front=q.remove();
            ans[idx++]=front;
            for(int ele:al.get(front)){
                indegree[ele]--;
                if(indegree[ele]==0) q.add(ele);
            }
        }

        if(ans.length!=numCourses) return new int[0];
        return ans;


    }
}