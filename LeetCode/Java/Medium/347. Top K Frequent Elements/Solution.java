class Pair{
    int val;
    int freq;

    Pair(int val,int freq){
        this.val=val;
        this.freq=freq;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int ele:nums) map.put(ele,map.getOrDefault(ele,0)+1);
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.freq-b.freq);
        for(int ele:map.keySet()){
            pq.add(new Pair(ele,map.get(ele)));
            if(pq.size()>k) pq.remove();
        }
        for(int i=0;i<k;i++){
            Pair top=pq.remove();
            ans[i]=top.val;
        }

        return ans;
    }
}