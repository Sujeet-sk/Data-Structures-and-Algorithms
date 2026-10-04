class Solution {
    public static boolean isPresent(int sum,int i,int[] arr,Boolean[][] dp){
        if(i==arr.length) return (sum==0);
        if(dp[i][sum]!=null) return dp[i][sum];
        boolean pick=false;
        if(sum>=arr[i]) pick=isPresent(sum-arr[i],i+1,arr,dp);
        boolean skip=isPresent(sum,i+1,arr,dp);
        return dp[i][sum]=pick || skip;
    }
    static boolean isSubsetSum(int arr[], int sum) {
        int n=arr.length;
        Boolean[][] dp=new Boolean[n][sum+1];
        return isPresent(sum,0,arr,dp);
    }
}