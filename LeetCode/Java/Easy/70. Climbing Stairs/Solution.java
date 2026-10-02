class Solution {
    public int ways(int n,int[] dp){
        if(n==0 || n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        int first=ways(n-1,dp);
        int second=ways(n-2,dp);
        return first+second;
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return ways(n,dp);
    }
}