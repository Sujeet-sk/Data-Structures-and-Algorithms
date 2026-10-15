class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        int max_len=0;
        int[][] dp=new int[n][n];
        for(int k=0;k<n;k++){
            int i=0,j=k;
            int len=0;
            while(j<n){
                if(i==j){
                    dp[i][j]=1;
                    len=j-i+1;
                }
                else if(j==i+1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=1;
                        len=j-i+1;
                    }
                }
                else {
                    if(s.charAt(i)==s.charAt(j)){
                        if(dp[i+1][j-1]==1){
                            dp[i][j]=1;
                            len=j-i+1;
                        }
                    }
                }

                if(dp[i][j]==1 && len>max_len){
                    max_len=len;
                    ans=s.substring(i,j+1);
                }

                i++;
                j++;
            }
        }
        return ans;
    }
}