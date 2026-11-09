class Pair{
    int node;
    int time;
    Pair(int node,int time){
        this.node=node;
        this.time=time;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<times.length;i++){
            int src=times[i][0],des=times[i][1],t=times[i][2];
            adj.get(src).add(new Pair(des,t));
        }

        int[] dis=new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[k]=0;
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Integer.compare(a.time,b.time));
        pq.add(new Pair(k,0));
        while(pq.size()>0){
            Pair front=pq.remove();
            int node=front.node;
            for(Pair p:adj.get(node)){
                int Ttime=front.time+p.time;
                if(Ttime<dis[p.node]){
                    dis[p.node]=Ttime;
                    pq.add(new Pair(p.node,Ttime));
                }
            }
        }

        int ans=-1;
        for(int i=1;i<=n;i++){
            if(dis[i]==Integer.MAX_VALUE) return -1;
            ans=Math.max(ans,dis[i]);
        }

        return ans;
    }
}