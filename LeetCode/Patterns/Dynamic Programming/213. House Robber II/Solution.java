class Solution {
    public int maxAmount(int i,int j,int[] nums,int[] dp){
        if(i>j) return 0;
        if(dp[i]!=-1 && dp[i]<nums[i]) return dp[i];
        int pick=nums[i]+maxAmount(i+2,j,nums,dp);
        int skip=maxAmount(i+1,j,nums,dp);
        return dp[i]=Math.max(pick,skip);
    }
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        int n=nums.length;
        Arrays.fill(dp,-1);
        return Math.max(maxAmount(0,n-2,nums,dp),maxAmount(1,n-1,nums,dp));

    }
}