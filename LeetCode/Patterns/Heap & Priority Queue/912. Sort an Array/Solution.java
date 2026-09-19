class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int[] ans=new int[nums.length];
        int idx=0;
        for(int i=0;i<nums.length;i++) pq.add(nums[i]);
        while(pq.size()>0) ans[idx++]=pq.remove();

        return ans;
    }
}