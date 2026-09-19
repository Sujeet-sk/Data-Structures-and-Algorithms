class Solution {
    public void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int idx=0;
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k) arr[idx++]=pq.remove();
        }
        while(pq.size()>0) arr[idx++]=pq.remove();
    }
}
