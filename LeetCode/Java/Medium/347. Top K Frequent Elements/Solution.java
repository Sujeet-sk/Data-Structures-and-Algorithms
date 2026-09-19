class Pair implements Comparable<Pair>{
    int num;
    int freq;
    Pair(int num,int freq){
        this.num=num;
        this.freq=freq;
    }
    public int compareTo(Pair t){
        return Integer.compare(this.freq,t.freq);
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:map.keySet()) pq.add(new Pair(ele,map.get(ele)));
        
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            Pair pr=pq.remove();
            ans[i]=pr.num;
        }
        return ans;
    }
}