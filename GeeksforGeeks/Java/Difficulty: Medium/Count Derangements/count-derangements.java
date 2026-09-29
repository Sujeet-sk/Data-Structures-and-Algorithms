class Solution {
    public int count(int n,int[] dp){
        if(n==1) return 0;
        if(n==2) return 1;
        if(dp[n]!=-1) return dp[n];
        int choice1=(n-1)*count(n-2,dp);
        int choice2=(n-1)*count(n-1,dp);
        return dp[n]=choice1+choice2;
    }
    public int derangeCount(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return count(n,dp);
    }
};