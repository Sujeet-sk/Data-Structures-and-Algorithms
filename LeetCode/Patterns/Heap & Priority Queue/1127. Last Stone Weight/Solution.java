class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:stones){
            pq.add(ele);
        }
        while(pq.size()>1){
            int x=pq.remove();
            int y=pq.remove();
            if(x!=y) pq.add(x-y);
        }
        if(pq.size()==1) return pq.remove();
        return 0;
    }
}