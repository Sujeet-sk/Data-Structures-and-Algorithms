class Solution {
    public int longCommSubstr(String s1, String s2) {
        int m=s1.length(),n=s2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=0;
            }
        }
        
        int max_len=0;
        for(int[] a:dp){
            for(int ele:a){
                int len=ele;
                max_len=Math.max(max_len,len);
            }
        }
        return max_len;
    }
}
