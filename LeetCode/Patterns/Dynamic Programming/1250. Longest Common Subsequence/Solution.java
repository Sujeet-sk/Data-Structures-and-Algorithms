class Solution {
    public int count(String s1,String s2,int m,int n,int[][] dp){
        if(m<0 || n<0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(s1.charAt(m)==s2.charAt(n)) return dp[m][n]=1+count(s1,s2,m-1,n-1,dp);
        else return dp[m][n]=Math.max(count(s1,s2,m,n-1,dp),count(s1,s2,m-1,n,dp));
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int m=s1.length(),n=s2.length();
        int[][] dp=new int[m][n];
        for(int[] ele:dp) Arrays.fill(ele,-1);
        return count(s1,s2,m-1,n-1,dp);
    }
}