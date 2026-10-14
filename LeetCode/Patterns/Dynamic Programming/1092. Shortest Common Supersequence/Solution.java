class Solution {
    public String lcs(String s1,String s2){
        int m=s1.length(),n=s2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        
        StringBuilder ans=new StringBuilder();
        int i=m,j=n;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                ans.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>=dp[i][j-1]) i--;
            else j--;
        }
        return ans.reverse().toString();
    }
    public String shortestCommonSupersequence(String str1, String str2) {
        String lcs=lcs(str1,str2);
        StringBuilder ans=new StringBuilder();
        int i=0,j=0,k=0;
        while(k<lcs.length()){
            while(str1.charAt(i)!=lcs.charAt(k)) ans.append(str1.charAt(i++));
            while(str2.charAt(j)!=lcs.charAt(k)) ans.append(str2.charAt(j++));
            ans.append(lcs.charAt(k));
            i++;
            j++;
            k++;
        }

        ans.append(str1.substring(i));
        ans.append(str2.substring(j));

        return ans.toString();
    }
}