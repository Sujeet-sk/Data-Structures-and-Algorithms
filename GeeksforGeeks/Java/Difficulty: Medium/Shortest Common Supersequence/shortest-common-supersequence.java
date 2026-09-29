class Solution {
    public static int length(String s1,String s2,int i,int j,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=1+length(s1,s2,i-1,j-1,dp);
        else return dp[i][j]=Math.max(length(s1,s2,i-1,j,dp),length(s1,s2,i,j-1,dp));
    }
    public static int minSuperSeq(String s1, String s2) {
        int[][] dp=new int[s1.length()][s2.length()];
        for(int[]ele:dp) Arrays.fill(ele,-1);
        int i=s1.length()-1;
        int j=s2.length()-1;
        int ans=length(s1,s2,i,j,dp);
        return s1.length()+s2.length()-ans;
    }
}