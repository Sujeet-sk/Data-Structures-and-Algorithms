class Solution {
    static int[] dp;
    public int loot(int i,int j,int[] nums){
        if(i>j) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick=nums[i]+loot(i+2,j,nums);
        int skip=loot(i+1,j,nums);
        int ans=Math.max(pick,skip);
        dp[i]=ans;
        return ans;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        dp=new int[n];
        Arrays.fill(dp,-1);
        int first=loot(0,n-2,nums);
        Arrays.fill(dp,-1);
        int second=loot(1,n-1,nums);
        return Math.max(first,second);
    }
}