class Solution {
    public int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue(Collections.reverseOrder());
        for(int ele:arr) pq.add(ele);
        int val=0;
        for(int i=1;i<=k;i++){
            val=pq.poll();
        }
        return val;
    }
}