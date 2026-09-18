class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        int count=0;
        for(int ele:map.keySet()){
            int rem1=ele-k;
            if(k==0){
                if(map.get(ele)>1) count++;
            }
            else{
                if(map.containsKey(rem1)) count++;
            }
        }
        return count;


    }
}