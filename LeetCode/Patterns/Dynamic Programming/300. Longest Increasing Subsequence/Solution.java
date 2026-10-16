class Solution {
    public int longest(int idx,int prev,int[] nums,int[][] dp){
        if(idx==nums.length) return 0;
        if(dp[idx][prev+1]!=-1) return dp[idx][prev+1];
        int pick=0;
        if(prev==-1 || nums[idx]>nums[prev]) pick=1+longest(idx+1,idx,nums,dp);
        int skip=longest(idx+1,prev,nums,dp);
        return dp[idx][prev+1]=Math.max(pick,skip);
    }
    public int lengthOfLIS(int[] nums) {
        int[][] dp=new int[nums.length][nums.length];
        for(int[] ele:dp) Arrays.fill(ele,-1);
        return longest(0,-1,nums,dp);
    }
}