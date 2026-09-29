class Solution {
    public boolean isPerfect(int n){
        int sqrt=(int)(Math.sqrt(n));
        return sqrt*sqrt==n;
    }
    public int minSquare(int n,int[] dp){
        if(isPerfect(n)) return 1;
        if(dp[n]!=-1) return dp[n];
        int least=n;
        for(int i=1;i*i<=n;i++){
            int count=minSquare(i*i,dp)+minSquare(n-i*i,dp);
            least=Math.min(least,count);
        }
        return dp[n]=least;
    }
    public int numSquares(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return minSquare(n,dp);
    }
}