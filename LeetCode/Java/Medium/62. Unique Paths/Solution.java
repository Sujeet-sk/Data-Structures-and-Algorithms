class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[2][n];
        if(m==1) return 1;
        for(int j=0;j<n;j++) dp[0][j]=1;
        dp[1][0]=1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[1][j]=dp[1][j-1]+dp[0][j];
                dp[0][j]=dp[1][j];
            }
        }
        return dp[1][n-1];
    }
}