class Solution {
    public int minCost(int[] arr) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++) pq.add(arr[i]);
        
        int cost=0;
        while(pq.size()>1){
            int a=pq.remove();
            int b=pq.remove();
            int sum=a+b;
            cost+=sum;
            pq.add(sum);
        }
        
        return cost;
    }
}