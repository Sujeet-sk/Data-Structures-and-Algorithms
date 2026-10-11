class Solution {
    public int min(StringBuilder s1,StringBuilder s2,int i,int j, int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j]=min(s1,s2,i-1,j-1,dp);
        int insert=1+min(s1,s2,i,j-1,dp);
        int delete=1+min(s1,s2,i-1,j,dp);
        int replace=1+min(s1,s2,i-1,j-1,dp);
        return dp[i][j]=Math.min(insert,Math.min(delete,replace));
    }
    public int minDistance(String s1, String s2) {
        int m=s1.length(),n=s2.length(); 
        int[][] dp=new int[m][n];
        for(int[] ele:dp) Arrays.fill(ele,-1);
        return min(new StringBuilder(s1),new StringBuilder(s2),m-1,n-1,dp);   
    }
}