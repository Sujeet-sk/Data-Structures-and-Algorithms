class Triplet implements Comparable<Triplet>{
    int dis;
    int x;
    int y;
    Triplet(int dis,int x,int y){
        this.dis=dis;
        this.x=x;
        this.y=y;
    }
    public int compareTo(Triplet t){
        return Integer.compare(this.dis,t.dis);
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][]ans=new int[k][2];
        PriorityQueue<Triplet>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int[] ele:points){
            int dis=ele[0]*ele[0] + ele[1]*ele[1];
            pq.add(new Triplet(dis,ele[0],ele[1]));
            if(pq.size()>k) pq.remove();
        }
        
        for(int i=0;i<k;i++){
            Triplet top=pq.remove();
            ans[i][0]=top.x;
            ans[i][1]=top.y;
        }
        return ans;

    }
}