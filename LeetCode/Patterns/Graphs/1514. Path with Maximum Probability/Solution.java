class Pair{
    int node;
    double prob;
    Pair(int node,double prob){
        this.node=node;
        this.prob=prob;
    }
}
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<Pair>>adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int a=edges[i][0],b=edges[i][1]; double c=succProb[i];
            adj.get(a).add(new Pair(b,c));
            adj.get(b).add(new Pair(a,c));
        }

        double[] ans=new double[n];
        ans[start]=1;
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->Double.compare(b.prob,a.prob));
        pq.add(new Pair(start,1));
        while(pq.size()>0){
            Pair front=pq.remove();
            int node=front.node;
            for(Pair p:adj.get(node)){
                double tProb=front.prob*p.prob;
                if(tProb>ans[p.node]){
                    ans[p.node]=tProb;
                    pq.add(new Pair(p.node,tProb));
                }
            }
        }

        return ans[end];
    }
}