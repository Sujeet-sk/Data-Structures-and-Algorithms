class Solution {
    public int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k) pq.remove();
        }
        
        int smallest=pq.peek();
        return smallest;
    }
}
