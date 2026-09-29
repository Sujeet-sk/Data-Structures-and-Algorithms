class Solution {
    public static int length(String s,String s2,int i,int j,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==s2.charAt(j)) return dp[i][j]=1+length(s,s2,i-1,j-1,dp);
        else return dp[i][j]=Math.max(length(s,s2,i-1,j,dp),length(s,s2,i,j-1,dp));
    }
    public static int lps(String s) {
        String s2=new StringBuilder(s).reverse().toString();
        int[][] dp=new int[s.length()][s2.length()];
        for(int[]ele:dp) Arrays.fill(ele,-1);
        int i=s.length()-1;
        int j=s2.length()-1;
        return length(s,s2,i,j,dp);
    }
    static int findMinInsertions(String s) {
        return s.length()-lps(s);
    }
}