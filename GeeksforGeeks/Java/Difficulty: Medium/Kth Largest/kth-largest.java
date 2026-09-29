class Solution {
    public static int kthLargest(int arr[], int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int i=0;
        while(i<arr.length){
            pq.add(arr[i]);
            if(pq.size()>k) pq.remove();
            i++;
        }
        return pq.peek();
    }
}