class Solution {
    public int minCost(int n,int[] cost,int[] dp){
        if(n>=cost.length) return 0;
        if(dp[n]!=-1) return dp[n];
        int pick=cost[n]+minCost(n+2,cost,dp);
        int skip=cost[n]+minCost(n+1,cost,dp);
        return dp[n]=Math.min(pick,skip);
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(minCost(0,cost,dp),minCost(1,cost,dp));
    }
}