class Solution {
    public int fib(int n) {
        int[] dp=new int[3];
        if(n>0) dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[2]=dp[1]+dp[0];
            dp[1]=dp[2];
            dp[0]=dp[1];
        }
        return dp[2];
    }
}