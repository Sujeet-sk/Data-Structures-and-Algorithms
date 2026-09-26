class Solution {
    public int paths(int m,int n,int[][] dp){
        if(m==1 || n==1) return 1;
        if(dp[m][n]!=-1) return dp[m][n];
        int down=paths(m-1,n,dp);
        int right=paths(m,n-1,dp);
        return dp[m][n]=down+right;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m+1][n+1];
        for(int[] ele:dp) Arrays.fill(ele,-1);
        return paths(m,n,dp);
    }
}