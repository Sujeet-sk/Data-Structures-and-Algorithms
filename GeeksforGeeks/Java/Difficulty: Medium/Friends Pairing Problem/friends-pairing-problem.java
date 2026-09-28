class Solution {
    public int ways(int n, int[] dp){
        if(n==1 || n==2) return n;
        if(dp[n]!=-1) return dp[n];
        int Npair=ways(n-1,dp);
        int pair=(n-1)*ways(n-2,dp);
        return dp[n]=Npair+pair;
    }
    public int countFriendsPairings(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return ways(n,dp);
    }
}
