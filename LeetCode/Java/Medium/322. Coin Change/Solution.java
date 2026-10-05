class Solution {
    public long minCoin(int A,int i,int[] coins,long[][] dp){
        if(A==0) return 0;
        if(i==coins.length) return Integer.MAX_VALUE;
        if(dp[i][A]!=-1) return dp[i][A];
        long pick=Integer.MAX_VALUE;
        if(A>=coins[i]) pick=1+minCoin(A-coins[i],i,coins,dp);
        long skip=minCoin(A,i+1,coins,dp);
        return dp[i][A]=Math.min(pick,skip);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        long[][] dp=new long[n][amount+1];
        for(long[] ele:dp) Arrays.fill(ele,-1);
        int res=(int)minCoin(amount,0,coins,dp);
        if(res==Integer.MAX_VALUE) return -1;
        return res;
    }
}