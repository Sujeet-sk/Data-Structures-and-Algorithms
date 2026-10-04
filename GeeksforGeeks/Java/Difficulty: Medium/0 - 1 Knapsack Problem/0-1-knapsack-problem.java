class Solution {
    public int value(int W,int i,int[] val,int[] wt,int [][] dp){
        if(i==wt.length) return 0;
        if(dp[i][W]!=-1) return dp[i][W];
        int pick=0;
        if(W>=wt[i]) pick=val[i]+value(W-wt[i],i+1,val,wt,dp);
        int skip=value(W,i+1,val,wt,dp);
        return dp[i][W]=Math.max(pick,skip);
    }
    public int knapsack(int W, int val[], int wt[]) {
        int n=val.length;
        int[][] dp=new int[n][W+1];
        for(int[] ele:dp) Arrays.fill(ele,-1);
        return value(W,0,val,wt,dp);
    }
}
