class Solution {
    public int value(int C,int i,int[] val,int[] wt,int [][] dp){
        if(i==val.length) return 0;
        if(dp[i][C]!=-1) return dp[i][C];
        int pick=0;
        if(C>=wt[i]) pick=val[i]+value(C-wt[i],i,val,wt,dp);
        int skip=value(C,i+1,val,wt,dp);
        return dp[i][C]=Math.max(pick,skip);
    }
    public int knapSack(int val[], int wt[], int capacity) {
        int n=val.length;
        int[][] dp=new int[n][capacity+1];
        for(int[] ele:dp) Arrays.fill(ele,-1);
        return value(capacity,0,val,wt,dp);
    }
}