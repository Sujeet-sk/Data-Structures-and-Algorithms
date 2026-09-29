class Solution {
    public int value(int[] val,int[] wt,int capacity,int[][] dp,int i){
        if(i>=val.length) return 0;
        if(dp[i][capacity]!=-1) return dp[i][capacity];
        int pick=0;
        if(capacity>=wt[i]) pick=val[i]+ value(val,wt,capacity-wt[i],dp,i);
        int skip=value(val,wt,capacity,dp,i+1);
        int ans=Math.max(pick,skip);
        dp[i][capacity]=ans;
        return ans;
    }
    public int knapSack(int val[], int wt[], int capacity) {
        int[][] dp=new int[val.length][capacity+1];
        for(int[] ele:dp) Arrays.fill(ele,-1);
        return value(val,wt,capacity,dp,0);
    }
}