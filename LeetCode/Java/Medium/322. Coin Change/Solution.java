class Solution {
    public long minCoin(int A,int i,int[] coins,int[][] dp){
        if(i==coins.length){
            if(A==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[i][A]!=-1) return dp[i][A];
        long pick=Integer.MAX_VALUE;
        if(A>=coins[i]) pick=1+minCoin(A-coins[i],i,coins,dp);
        long skip=minCoin(A,i+1,coins,dp);
        return dp[i][A]=(int)Math.min(pick,skip);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        if(amount==0) return 0;
        int[][] dp=new int[n][amount+1];
        for(int[] ele:dp) Arrays.fill(ele,-1);
        int res=(int)minCoin(amount,0,coins,dp);
        if(res==Integer.MAX_VALUE) return -1;
        return res;
    }
}