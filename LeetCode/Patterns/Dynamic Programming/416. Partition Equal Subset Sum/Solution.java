class Solution {
    public boolean isPresent(int target,int i,int[] nums,Boolean[][] dp){
        if(i==nums.length) return (target==0);
        if(dp[i][target]!=null) return dp[i][target];
        boolean pick=false;
        if(target>=nums[i]) pick=isPresent(target-nums[i],i+1,nums,dp);
        boolean skip=isPresent(target,i+1,nums,dp);
        return dp[i][target]=pick || skip;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int ele:nums) sum+=ele;
        if(sum%2!=0) return false;
        int target=sum/2;
        int n=nums.length;
        Boolean[][] dp=new Boolean[n][target+1];
        return isPresent(target,0,nums,dp);
    }
}