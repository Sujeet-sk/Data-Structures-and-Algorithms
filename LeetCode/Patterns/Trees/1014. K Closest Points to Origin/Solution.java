class Triplet{
    int x;
    int y;
    int dist;

    Triplet(int x,int y,int dist){
        this.x=x;
        this.y=y;
        this.dist=dist;
    }
}

class Solution {
    public int[][] kClosest(int[][] arr, int k) {
        int[][] ans=new int[k][2];
        PriorityQueue<Triplet>pq=new PriorityQueue<>((a,b)->b.dist-a.dist);
        for(int[] ele:arr){
            int dist=ele[0]*ele[0]+ele[1]*ele[1];
            pq.add(new Triplet(ele[0],ele[1],dist));
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