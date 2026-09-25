class Solution {
    public int maxAmount(int n,int[] nums,int[] dp){
        if(n>=nums.length) return 0;
        if(dp[n]!=-1) return dp[n];
        int pick=nums[n]+maxAmount(n+2,nums,dp);
        int skip=maxAmount(n+1,nums,dp);
        return dp[n]=Math.max(pick,skip);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return maxAmount(0,nums,dp);
    }
}