class Solution {
    public int lps(String s){
        StringBuilder sb=new StringBuilder(s);
        String s1=sb.reverse().toString();
        int m=s.length(),n=s1.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==s1.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[m][n];
    }
    public int minInsertions(String s) {
        return s.length()-lps(s);
    }
}